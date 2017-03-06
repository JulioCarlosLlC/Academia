
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Matricula {
    
 public boolean GetRegistrarMatricula(String codigo_matricula,String nombre,String apellido,String sede,String ciclo,String turno){
       boolean respuesta = false;
       boolean alum = false;
       String codigo_alumno="",id_sede="",id_ciclo="";
        try {
             Connection conex =Conexion.obtener();
             PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaAlumno();");
             ResultSet Resultado=Consultar.executeQuery();
             while (Resultado.next()) {                
                 if(Resultado.getString("nombre").equals(nombre) && Resultado.getString("apellidos").equals(apellido)){
                     alum=true;break;
                 } 
             }  
        }catch (Exception e) {
            }
      
        if(!alum){
             Calendar fecha = Calendar.getInstance();
             int año = fecha.get(Calendar.YEAR);
             int mes = fecha.get(Calendar.MONTH) + 1;
             int segundo = fecha.get(Calendar.SECOND);   
             codigo_alumno=año+""+mes+""+segundo;
             Usuario objUsuario = new Usuario();
             objUsuario.GetRegistrarAlumno(codigo_alumno.trim(),nombre.trim(),apellido.trim());
        }

        try{
             Connection conex =Conexion.obtener();
              PreparedStatement Consultar2 =conex.prepareStatement("CALL  usp_getListaSede();");
              ResultSet Resultado2=Consultar2.executeQuery();
              while (Resultado2.next()) {                
                 if(Resultado2.getString("NomSede").equals(sede)){
                     id_sede=Resultado2.getString("IdSede");
                 } 
               }
              JOptionPane.showMessageDialog(null," sede "+id_sede);
              PreparedStatement Consultar3 =conex.prepareStatement("CALL  usp_getListaCiclo();");
              ResultSet Resultado3=Consultar3.executeQuery();
              while (Resultado3.next()) {                
                 if(Resultado3.getString("NomCiclo").equals(ciclo)){
                     id_ciclo=Resultado3.getString("IdCiclo");
                     JOptionPane.showMessageDialog(null," ciclo adentro "+id_ciclo);
                 } 
               }
              JOptionPane.showMessageDialog(null," ciclo "+id_ciclo);
              
              JOptionPane.showMessageDialog(null," "+codigo_matricula+"  "+codigo_alumno+" "+id_sede+" "+id_ciclo+" "+turno);
             PreparedStatement Consultar4 =conex.prepareStatement("CALL  usp_getRegistrarMatricula(?,?,?,?,?);");
                Consultar4.setString(1,codigo_matricula);
                Consultar4.setString(2,codigo_alumno);
                Consultar4.setString(3,id_sede);
                Consultar4.setString(4,id_ciclo);
                Consultar4.setString(5,turno);
                Consultar4.executeUpdate(); 
 
             Conexion.Cerrar(); 
        } catch (Exception e) {
             respuesta=false;
        }
        return respuesta;
    }
}

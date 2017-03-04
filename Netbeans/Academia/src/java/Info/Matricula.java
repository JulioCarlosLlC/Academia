
package Info;

import Info.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Matricula {
    
 public boolean GetRegistrarMatricula(String codigo_matricula,String nombre,String apellido,String sede,String ciclo, String turno){
        boolean existealumno=false;
        boolean registroalumno=false;
        boolean respuesta=false;
        String codigo="",idsede="",idciclo="";
            //busca si existe el alumno
            try {
                if (nombre != null && apellido != null && !nombre.equals("")){
                    Connection conex =Info.Conexion.obtener();
                    PreparedStatement Consultar =conex.prepareStatement("CALL usp_getListaAlumno();");
                    ResultSet Resultado =Consultar.executeQuery();
                    while (Resultado.next()) {                
                        if(Resultado.getString("nombre").equals(nombre) && Resultado.getString("apellidos").equals(apellido)){
                            codigo = Resultado.getString("codigo");
                            existealumno=true;
                        }
                    }
                }
            } catch (Exception e) {
                }
            //al no existir el alumno se crea
            if(!existealumno){
                    Usuario objusuario = new Usuario();
                    codigo=nombre+"15";
                    registroalumno=objusuario.GetRegistrarAlumno(codigo,nombre,apellido);
            }
            
            //Ingresa la matricula
            try {
            Connection conex =Info.Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getRegistrarMatricula(?,?,?,?,?);");
            Consultar.setString(1,codigo_matricula);
            Consultar.setString(2,codigo);
                
                //buscar la id de sede
                try{
                    Connection conex3 =Info.Conexion.obtener();
                    PreparedStatement Consultar3 =conex3.prepareStatement("CALL  usp_getListaSede;");
                    ResultSet Resultado3=Consultar3.executeQuery();
                    while (Resultado3.next()) {                
                        if(Resultado3.getString("NomSede").equals(sede)){
                            idsede=Resultado3.getString("IdSede");
                        } 
                    } 
                }catch (Exception e) {} 
                
                //buscar la id de ciclo
                try{
                    Connection conex4 =Info.Conexion.obtener();
                    PreparedStatement Consultar4 =conex4.prepareStatement("CALL  usp_getListaCiclo;");
                    ResultSet Resultado4=Consultar4.executeQuery();
                    while (Resultado4.next()) {                
                        if(Resultado4.getString("NombCiclo").equals(ciclo)){
                            idciclo=Resultado4.getString("IdCiclo");
                        } 
                    }
                }catch (Exception e) {}                 
            
            Consultar.setString(3,idsede);
            Consultar.setString(4,idciclo);
            Consultar.setString(5,turno);
                
            Consultar.executeUpdate();
            
            Info.Conexion.cerrar(); 
            
            } catch (Exception e) {} 
        
        try{
            Connection conex =Info.Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaMatricula();");
             ResultSet Resultado=Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("codMatricula").equals(codigo_matricula)){
                    JOptionPane.showMessageDialog(null,"Persona ingresado");
                    respuesta=true;break;
                } 
            }
            Info.Conexion.cerrar(); 
        } catch (Exception e) {
            respuesta=false;
        }
        
        return respuesta;
    }  
}

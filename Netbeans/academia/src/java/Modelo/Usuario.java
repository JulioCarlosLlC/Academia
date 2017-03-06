
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;
public class Usuario {
    
    public boolean GetClaveUsuario(String Usuario,String Clave){
        boolean respuesta=false;
        
        try {
            if (Usuario != null && Clave != null && !Usuario.equals("")){
                    JOptionPane.showMessageDialog(null," usuario "+Conexion.obtener());
                Connection conex =Conexion.obtener();
                PreparedStatement Consultar =conex.prepareStatement("CALL usp_getLogin(?);");
                Consultar.setString(1, Usuario);
                ResultSet Resultado =Consultar.executeQuery();
                while (Resultado.next()) {                
                    if(Resultado.getString("clave").equals(Clave)){
                        respuesta=true;break;
                    }
                }
                Conexion.Cerrar(); 
            }
        } catch (Exception e) {
            respuesta=false;
        }
        return respuesta;
    }

    
    public boolean GetRegistrarAlumno(String codigo,String nombre,String apellidos){
        boolean respuesta=false;
        try {
            
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getRegistrarAlumno(?,?,?);");
            Consultar.setString(1,codigo);
            Consultar.setString(2, nombre);
            Consultar.setString(3, apellidos);
            Consultar.executeUpdate();
            Conexion.Cerrar(); 
        } catch (Exception e) {} 
        try{
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaAlumno();");
             ResultSet Resultado=Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("codigo").equals(codigo)){
                    respuesta=true;break;
                } 
            }
            Conexion.Cerrar(); 
        } catch (Exception e) {
            respuesta=false;
        }
        
        return respuesta;
    }
    
    
    
    
}

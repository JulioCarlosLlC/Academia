
package Info;
import java.sql.*;
import javax.swing.JOptionPane;
public class Usuario {
    
    public boolean GetClaveUsuario(String Usuario,String Clave){
        boolean respuesta=false;
        try {
            if (Usuario != null && Clave != null && !Usuario.equals("")){
                Connection conex =Conexion.obtener();
                PreparedStatement Consultar =conex.prepareStatement("CALL usp_getLogin(?);");
                Consultar.setString(1, Usuario);
                ResultSet Resultado =Consultar.executeQuery();
                while (Resultado.next()) {                
                    if(Resultado.getString("clave").equals(Clave)){
                        respuesta=true;break;
                    }
                }
                Conexion.cerrar(); 
            }
        } catch (Exception e) {
            respuesta=false;
        }
        return respuesta;
    }
    
    /**
    public boolean GetCrear(String Usuario,String Clave){
        boolean respuesta=false;
        
        try {
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_RegistrarUsuario(?,?);");
           
            Consultar.setString(1, Usuario);
            Consultar.setString(2, Clave); 
            Consultar.executeUpdate();
            Conexion.cerrar(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se ingreso el dato por el motivo: "+e);
        }
        
        try {
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getClaveUsuario(?);");
            Consultar.setString(1, Usuario);
            ResultSet Resultado =Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("clave").equals(Clave)){
                    JOptionPane.showMessageDialog(null,"Bienvenido"+ Usuario+" un nuevo usuario");
                    respuesta=true;break;
                } 
            }
            Conexion.cerrar(); 
        } catch (Exception e) {
            respuesta=false;
        }
        return respuesta;
    }
           
    */
    public boolean Getduplica_usuario(String Nombre,String Apellido){
      boolean respuesta=false;
        try {
            if (Nombre != null && Apellido != null && !Nombre.equals("")){
                Connection conex =Conexion.obtener();
                PreparedStatement Consultar =conex.prepareStatement("CALL usp_getListaAlumno(?);");
                Consultar.setString(1, Nombre);
                ResultSet Resultado =Consultar.executeQuery();
                while (Resultado.next()) {                
                    if(Resultado.getString("apellidos").equals(Apellido)){
                        respuesta=true;break;
                    }
                }
                Conexion.cerrar(); 
            }
        } catch (Exception e) {
            respuesta=false;
        }
        return respuesta;   
    }
    
    public String Getusuario_antiguo(String Nombre,String Apellido){
      String respuesta="";
        try {
            if (Nombre != null && Apellido != null && !Nombre.equals("")){
                Connection conex =Conexion.obtener();
                PreparedStatement Consultar =conex.prepareStatement("CALL usp_getListaAlumno(?);");
                Consultar.setString(1, Nombre);
                ResultSet Resultado =Consultar.executeQuery();
                while (Resultado.next()) {                
                    if(Resultado.getString("apellidos").equals(Apellido)){
                        respuesta=Resultado.getString("codigo");break;
                    }
                }
                Conexion.cerrar(); 
            }
        } catch (Exception e) {
            respuesta="Ingrese su codigo";
        }
        return respuesta;   
    }
    
    public boolean GetRegistrarAlumno(String codigo,String nombre,String apellidos){
        boolean respuesta=false;
        try {
            Connection conex =Info.Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getRegistrarAlumno(?,?,?);");
            Consultar.setString(1,codigo);
            Consultar.setString(2, nombre);
            Consultar.setString(3, apellidos);
            Consultar.executeUpdate();
            Info.Conexion.cerrar(); 
        } catch (Exception e) {} 
        try{
            Connection conex =Info.Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaAlumno();");
             ResultSet Resultado=Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("codigo").equals(codigo)){
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

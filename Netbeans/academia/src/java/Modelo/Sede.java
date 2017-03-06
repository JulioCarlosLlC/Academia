
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Sede {
     public boolean GetRegistrarSede(String codigo_Sede,String nombre_Sede){
        boolean respuesta=false;
        try {
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getRegistrarSede(?,?);");
            Consultar.setString(1,codigo_Sede);
            Consultar.setString(2, nombre_Sede);
            Consultar.executeUpdate();
            Conexion.Cerrar(); 
        } catch (Exception e) {} 
        try{
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaSede();");
             ResultSet Resultado=Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("IdSede").equals(codigo_Sede)){
                    JOptionPane.showMessageDialog(null,"Persona ingresado");
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

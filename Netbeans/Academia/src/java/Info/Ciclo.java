
package Info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Ciclo {
        public boolean GetRegistrarCiclo(String codigo_Ciclo,String nombre_Ciclo){
        boolean respuesta=false;
        try {
            Connection conex =Info.Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getRegistrarCiclo(?,?);");
            Consultar.setString(1,codigo_Ciclo);
            Consultar.setString(2, nombre_Ciclo);
            Consultar.executeUpdate();
            Info.Conexion.cerrar(); 
        } catch (Exception e) {} 
        try{
            Connection conex =Info.Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaCiclo();");
             ResultSet Resultado=Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("IdCiclo").equals(codigo_Ciclo)){
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

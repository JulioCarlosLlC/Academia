package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    static String Server, port, database, username, password,driver;
      
    private static void datos()
    {
        LeerXML objXML=new LeerXML();
        String[] Access=objXML.cargarXML();
        Server=Access[0];
        port=Access[1];
        database=Access[2];
        username=Access[3];
        password=Access[4];
        driver=Access[5];
        ActividadLog Log;
        
        for(int i=0;i<Access.length;i++)
        {
            Log=new ActividadLog("Datos",Access[i]);
        }
    }
    
    
    private static Connection cnx = null;

    public static Connection obtener() {
        if (cnx == null) {
            try 
            {
                datos();
                Class.forName(driver);
                cnx=DriverManager.getConnection(Server+database,username,password);
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage().toString(),
                        "Error", 0);
                ActividadLog Log=new ActividadLog(Conexion.class.getName(),ex.getMessage());
            }
        }
        return cnx;
    }

    public static void Cerrar() {
        try {
            if (cnx != null) {
                cnx.close();
                cnx = null;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
    }

}

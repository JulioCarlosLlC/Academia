package Info;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener() {
        if (cnx == null) {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection(""
                        + "jdbc:mysql://localhost:3306/academia", "root", "");
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage().toString(),
                        "Error", 0);
            }
        }
        return cnx;
    }

    public static void cerrar() {
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

package cuartouta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/cv";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection conectar() throws SQLException {
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR INTERNO DEL SERVIDOR");
            return null;
        }
    }
}

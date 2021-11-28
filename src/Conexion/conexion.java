package Conexion;

import Modelo.usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RSSpe
 */
public class conexion extends Thread {

    public static String consulta;
    private static Connection conexion = null;
    private static PreparedStatement pstm; //NO es tan seguro ya que permite SQL Injection, se recomienda PreparedStatement
    private static ResultSet rs;
    private static String controlador;
    public static String URL;
    public static String texto;
    public static String busqueda;

    public conexion(Object o) {
    }

    private conexion() {
        try {
            controlador = "com.mysql.cj.jdbc.Driver";
            Class.forName(controlador);

            URL = "jdbc:mysql://localhost:3306/dreamhome";

            conexion = DriverManager.getConnection(URL, "root", "");

        } catch (ClassNotFoundException e) {
            System.out.println("Error de DRIVER");
        } catch (SQLException e) {
            System.out.println("Error de conexion en MySQL");
        }

    }

    public static Connection getConexion() {

        if (conexion == null) {
            new conexion();
        }

        return conexion;
    }

    public static void cerrarConexion() {
        try {
            pstm.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion");
            e.printStackTrace();
        }
    }

    // ----------------------------------------------------------------
    public static ResultSet consultaUser(usuario u) {

        try {
            // Procedimiento almacenado
            String consulta = "SELECT * from user WHERE us=? AND co=?";

            pstm = conexion.prepareStatement(consulta);
            pstm.setString(1, u.getU());
            pstm.setString(2, u.getC());
            rs = pstm.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return rs;
    }
    
}

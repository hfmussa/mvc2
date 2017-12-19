
package conexion;
import java.sql.*;

public class sql {
     public static void connect() {
        String url; //el jdbc:mysql es que vengo del worksbench de mysql, si utilizo otro programa se busca otra libreria
        url = "jdbc:mysql://localhost:3306/bd_prueba";
        String user = "root";
        String pass = "";
        System.out.println("Proceso de conexión...");
        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Conectados!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


import java.sql.Connection;

public class main {
    public static void main(String[] args) {
        Conexion connection = new Conexion();

        try {
            Connection cnx = connection.getConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsProvider {
    private static Connection con;
    public static Connection getConnection(){
        if (con == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","0109");


            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }
}

package Unit_4Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/unit_4?useSSL=false&allowPublicKeyRetrieval=true",
            "root", "root");

        System.out.println("Connection established");
    }
}

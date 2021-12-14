import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) {
        getConnection();
    }
    public static Connection getConnection() {
        try {
                String driver = "com.mysql.cj.jdbc.Driver";
                String databaseurl = "jdbc:mysql://localhost:3306/faculties";
                String username = "root";
                String password = "";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(databaseurl, username, password);
                System.out.println("Database connected");
                return conn;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}

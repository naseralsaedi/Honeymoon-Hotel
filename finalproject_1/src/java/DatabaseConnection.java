import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    Connection con = null;
    Statement stmt = null;
    ResultSet res;
    //1. JDBC driver name and database URL
    String databaseURL = "jdbc:mysql://localhost:3306/hotel";
    String driverName = "com.mysql.jdbc.Driver";
    //2. DB Credentials
    String user = "root";
    String dbpassword = "root";

    public Connection setConn() {
        try {
            //3. Register JDBC driver
            Class.forName(driverName).newInstance();
            //4. Open a connection
            con = DriverManager.getConnection(databaseURL, user, dbpassword);

        } catch (Exception e) {
            out.println("ERROR Connecting to DB: " + e);

        }

        return con;
    }

    public Connection closeConn() {
        try {
            stmt.close();
            con.close();
        } catch (SQLException e) {
            out.println(e + "ERROR: closing DB connection: ");
        }

        return con;

    }
}


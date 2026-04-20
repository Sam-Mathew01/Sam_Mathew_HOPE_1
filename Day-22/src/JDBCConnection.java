import java.sql.*;
public class JDBCConnection {
    public static void main(String[] args) throws SQLException {
        try {
            final String url = "jdbc:mysql://localhost:3306/StudentDB";
            final String username = "root";
            final String password = "0112";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con.getSchema());
            System.out.println("Connection is Successful with DB");
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

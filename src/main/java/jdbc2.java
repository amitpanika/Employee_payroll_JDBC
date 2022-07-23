import java.sql.*;

public class jdbc2 {
    public static void main(String[] args) throws SQLException {
        try {
        String url = "jdbc:mysql://localhost:3306/payroll";
        String username = "root";
        String password = "Amitpanika97@#";
        Connection connection=null;


            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            if ( connection.isClosed()){
                System.out.println("closed");
            }else {
                System.out.println("created ....................");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

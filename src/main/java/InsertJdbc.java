import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJdbc {
    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection..........

            String url = "jdbc:mysql://localhost:3306/javademo";
            String name = "root";
            String password = "Amitpanika97@#";

            Connection connection = DriverManager.getConnection(url,name,password);

            // create a query..............

            // create a statement..........

            Statement statement = connection.createStatement();
            statement.executeUpdate("create table table5( id int(20) not null)");
            statement.executeUpdate("create table table3( id int(20) not null)");
            statement.executeUpdate("create table table4( id int(20) not null)");
            System.out.println("table created in databases......");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

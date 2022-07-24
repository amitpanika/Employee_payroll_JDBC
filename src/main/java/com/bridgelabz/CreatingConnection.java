package com.bridgelabz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreatingConnection {
    public static void main(String[] args)  {
       
        try {
            
            String url = "jdbc:mysql://localhost:3306/salary";
            String username = "root";
            String password = "Amitpanika97@#";
            Connection connection = null;

            //  loading the Driver...........................

            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating Connection...........................

            connection = DriverManager.getConnection(url, username, password);
            if (connection.isClosed()) {
                System.out.println(" Connection closed");
            } else {
                System.out.println(" Connection created .....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



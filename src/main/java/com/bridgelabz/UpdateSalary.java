package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateSalary {
    public static void main(String[] args) {

        try {

            //  load the Driver..............

            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection.............

            String url = "jdbc:mysql://localhost:3306/salary";
            String name = "root";
            String password = "Amitpanika97@#";

            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("alter table employee add Salary double not null");
            statement.executeUpdate("alter table employee add start date not null");

            // Updating salary................

            statement.executeUpdate("update employee set salary = 300000.00 where name = 'bill'");
            statement.executeUpdate("update employee set salary = 200000.00 where name = 'Mark'");
            statement.executeUpdate("update employee set salary = 100000.00 where name = 'Charlie'");
            System.out.println("table created in database.......");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
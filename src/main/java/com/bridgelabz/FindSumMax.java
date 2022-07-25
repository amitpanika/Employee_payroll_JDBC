package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FindSumMax {
    public static void main(String[] args) {

        try{

              // load the Driver.............

            Class.forName("com.mysql.cj.jdbc.Driver");

              //  Create the connection.......

            String url = "jdbc:mysql://localhost:3306:/salary";
            String name = "root";
            String password = "Amitpanika97@#";
            Connection connection = DriverManager.getConnection(url, name, password);
            System.out.println("Driver loaded..............");

            Statement statement = connection.createStatement();

            //  Sum................
            statement.executeUpdate("select SUM(salary) sa sum salary from employee");

            //  Average............
            statement.executeUpdate("select AVG(salary) as avg salary from employee");

            // Minimum.............
            statement.executeUpdate("select MIN(salary) as min salary from employee");

            // Maximum.............
            statement.executeUpdate("select MAX(salary) as max salary from employee");

            // Count...............
            statement.executeUpdate("select COUNT(salary) as count salary from employee");

            // Print .............
            System.out.println(" Printed all the data in database..................");


        } catch (Exception e){
               e.printStackTrace();

        }
    }
}

package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.Class.forName;
import static java.sql.DriverManager.getConnection;

public class AddData {
    public static void main(String[] args) {


           try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/salary";
            String name = "root";
            String password = "Amitpanika97@#";
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("create table employee(id int(20) not null, name varchar(20) not null)");
            System.out.println("Table created in databases.....");
            connection.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
}

package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
            statement.executeUpdate("insert into employee(id, name) values (1,'bill'), (2,'Mark'), (3,'charlie')");
            System.out.println("Table created in databases.....");
            connection.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
}

package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDate {
    public static void main(String[] args) {

        try{

            // load the Driver...............

            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection.............

            String url = "jdbc:mysql://localhost:3306/salary";
            String name = "root";
            String password = "Amitpanika97@#";
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee set start = ('2018-01-03') where name ='bill'");
            statement.executeUpdate("update employee set start = ('2019-11-13') where name ='Mark'");
            statement.executeUpdate("update employee set start = ('2020-05-21') where name ='Charlie'");
            System.out.println(" table created in databases");
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;

    Statement statement;


    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","Navdeep@123");
            statement = connection.createStatement();

            // Create Database if not exists
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS employeemanagement");
            statement.executeUpdate("USE employeemanagement");

            // Create login table if not exists
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS login (username VARCHAR(20), password VARCHAR(20))");

            System.out.println("Database setup complete!");

        }catch(Exception e){
            e.printStackTrace();
        }


    }





}

package com.practicaljava.lesson21.employee;

import java.sql.*;

public class EmployeeList {

    public static void main(String[] args) {
        String sqlQuery = "Select * from Employee";

        // Open autocloseable Connection, Statement and get the result set

        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson21");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlQuery);
        )
        { // Process each column in the result set and print the data
            while (rs.next()){
                int empNo = rs.getInt("EMPO");
                String eName = rs.getString("ENAME");
                String job = rs.getString("JOB_TITLE");
                System.out.println("" + empNo + ", " + eName + " , " + job);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

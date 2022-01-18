package com.practicaljava.lesson21;

import java.sql.*;

public class ShowAnyData {

    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Usage: java ShowAnyData SQLSelectStatemen");
            System.out.println("For example: java ShowAnyData \"Select * from Employee\"");
            System.exit(1);
        }
        try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson21");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(args[0])){
            //Find out the number of columns, their names
            //and dispaly the data
            ResultSetMetaData rsMeta = rs.getMetaData();
            int colCount = rsMeta.getColumnCount();

            for (int i = 1; i <= colCount; i++) {
                System.out.println(rsMeta.getColumnName(i) + " ");
            }
            System.out.println();

            while (rs.next()){
                for (int i = 1; i <=colCount; i++) {
                    System.out.println(rs.getString(i) + " ");
                }
                System.out.println("\n"); //new line character
            }

        } catch (SQLException throwables) {
            System.out.println("SQLError " + throwables.getMessage() + " code " + throwables.getErrorCode());
            throwables.printStackTrace();
        }

    }

}

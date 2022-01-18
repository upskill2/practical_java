package com.practicaljava.lesson21.tryit;

import java.sql.*;

public class Portfolio implements Runnable {



    @Override
    public void run() {

        String sqlQuery =  "Select * from Portfolio";


        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson21");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlQuery);
        ) { while (rs.next()) {
            String symbol = rs.getString("symbol");
            int quantity = rs.getInt("quantity");
            float price = rs.getInt("price");

            float result = quantity * price;

            StringBuilder builder = new StringBuilder();
            builder.append("Symbol: ");
            builder.append(symbol);
            builder.append(", quantity: ");
            builder.append(quantity);
            builder.append(", total shares: ");
            builder.append(quantity * price);
            System.out.println(builder.toString());

        }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    }

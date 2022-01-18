package com.practicaljava.lesson17.newsthreadsleep;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TestThread3Sleep {

    public static void main(String[] args) {

        final SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Lambda expression for Market News

                Runnable news = ()->
        {
            try{
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000); //sleep for 1 seconds
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    System.out.println("The market is improving " + i + " " + timeformat.format(timestamp));
                                    }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + e.toString());
            }
        };

        Thread marketNews = new Thread(news,"Market News");
        marketNews.start();

        // Lambda expression for Portfolio

        Runnable port = ()->
        {
            try {
                for (int i = 0; i < 10; i++) {
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    Thread.sleep(700); // Sleep for 700 ms
                    System.out.println("You have " + (500 + i) + " shares of IBM" + " " + timeformat.format(timestamp));

                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + e.toString());
            }
        };



       Thread portolio = new Thread(port, "Portfolio Data");
       portolio.start();

        System.out.println("The main method of TestThread3Lambda is finished");
    }

}

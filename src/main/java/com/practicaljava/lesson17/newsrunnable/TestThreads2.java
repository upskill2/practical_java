package com.practicaljava.lesson17.newsrunnable;

import com.practicaljava.lesson17.newsextendsthread.Portfolio;

public class TestThreads2 {

    public static void main(String[] args) {
        Runnable mn2 = new MarketNews2();
        //passing Runnable object to a constructor

        Thread mn = new Thread(mn2, "Market News");
        mn.start();

        Runnable port2 = new Portfolio2();
        Thread p = new Thread(port2, "Portfolio Data");
        p.start();

        System.out.println("TestThreads2 is finished");

    }


}

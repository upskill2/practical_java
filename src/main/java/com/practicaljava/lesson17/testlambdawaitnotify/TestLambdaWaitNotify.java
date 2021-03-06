package com.practicaljava.lesson17.testlambdawaitnotify;

public class TestLambdaWaitNotify {
    private static Runnable getMktNewsRunnable(Object whoToNotify){

        return  () -> {
            try{
                for (int i=0; i<10;i++){
                    Thread.sleep (1000);  // sleep for 1 second
                    System.out.println( "The market is improving " + i);
                }

                synchronized(whoToNotify){
                    whoToNotify.notify(); // send notification to the calling thread
                }
            }catch(InterruptedException e ){
                System.out.println(Thread.currentThread().getName()
                        + e.toString());
            }
        };
    }


    public static void main(String args[]){

        TestLambdaWaitNotify thisInstance = new TestLambdaWaitNotify();


        // Runnable mktNewsRunnable = () -> {
        // Do something
        // But who to notify????
        // };


        Runnable mktNewsRunnable = getMktNewsRunnable(thisInstance);
        Thread marketNews = new Thread(mktNewsRunnable,"");
        marketNews.start();


        synchronized (thisInstance) {
            try{
                thisInstance.wait(20000);  // wait for up to 20 sec
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println( "The main method of TestLambdaWaitNotify is finished");
    }

}

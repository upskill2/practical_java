package com.practicaljava.lesson17.newsthreadsleep;

class MarketNews implements Runnable {

Object parent;

MarketNews (Object whoToNotify) {
    parent=whoToNotify;
}

    @Override
    public void run() {

    synchronized (parent){
        parent.notify();
    }
    }

}

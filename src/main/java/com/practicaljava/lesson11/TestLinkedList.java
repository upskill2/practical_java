package com.practicaljava.lesson11;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {


    public static void main(String[] args) {
        LinkedList passengerList = new LinkedList();
        passengerList.add("Alex Smith");
        passengerList.add("Mary Lou");
        passengerList.add("Sim Monk");
    //    passengerList.add(1,"VIP Customer");

        ListIterator iterator = passengerList.listIterator();

        System.out.println(iterator.next());
        iterator.add("VIP Customer");
        iterator.previous();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        //       System.out.println(iterator.next());
    }

}

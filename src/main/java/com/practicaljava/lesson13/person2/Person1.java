package com.practicaljava.lesson13.person2;

import java.util.ArrayList;
import java.util.List;

public class Person1 {

    String name;
    Payable validator_func;

    public Person1(String name, Payable validator_func) {
        this.name = name;
        this.validator_func = validator_func;
    }

    public void increasePayment(int percent) {
        if (validator_func.increasePay(percent)) {
            System.out.println("Payment increased for " + name + " on percent");
        } else {
            System.out.println("sorry we cannot increase payment for " + name + " on " + percent);
        }
    }

    public static void main(String[] args) {

        // Lambda 1
        Payable for_employeess = (percent) -> {
            return true;
        };

        // Lambda 2
        Payable for_contractors = (percent) -> {
            if (percent > Payable.INCREASE_CAP) {
                return false;
            } else {
                return true;
            }
        };


        List<Person1> workers = new ArrayList<>();
        workers.add(new Person1("Peter", for_employeess));
        workers.add(new Person1("Mary", for_contractors));

        for (Person1 worker : workers) {
            worker.increasePayment(30);
        }

    }

}

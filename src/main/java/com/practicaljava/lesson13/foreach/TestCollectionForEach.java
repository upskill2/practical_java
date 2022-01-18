package com.practicaljava.lesson13.foreach;

import java.util.Arrays;
import java.util.List;

public class TestCollectionForEach {


    public static void main(String[] args) {

        Person workers[] = new Person[3];
        workers[0] = new Person("John", 'E');
        workers[1] = new Person("Mary", 'C');
        workers[2] = new Person("Steve", 'E');

        List<Person> workersList = Arrays.asList(workers);

        // Imperative loop
        System.out.println("1. Running imperative loop");
        for (Person person : workersList) {
            if ('E' == person.getWorkersStatus()) {
                System.out.println(person.getName() + " is employee");
            } else if
            ('C' == person.getWorkersStatus()) {
                System.out.println(person.getName() + " is contractor");
            }
        }

        // Functional loop
        System.out.println("2. Running functional loop");
        workersList.forEach(person -> {
            if ('E' == person.getWorkersStatus()) {
                System.out.println(person.getName() + " is employee");
            } else if
            ('C' == person.getWorkersStatus()) {
                System.out.println(person.getName() + " is contractor");
            }
        });
    }

}


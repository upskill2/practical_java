package com.practicaljava.lesson13.foreach;

public class Person {

    private String name;

    private char workersStatus; // 'E' or 'C'

    public Person(String name, char workersStatus) {

        this.name = name;
        this.workersStatus = workersStatus;
    }

    public String getName() {
        return name;
    }

    public char getWorkersStatus() {
        return workersStatus;
    }

}

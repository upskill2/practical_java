package com.practicaljava.lesson12.tryit;

public class Employee {

    public String lName;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

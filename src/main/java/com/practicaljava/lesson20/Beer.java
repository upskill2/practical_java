package com.practicaljava.lesson20;

public class Beer {


    public String name;
    public String country;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public float getPrice() {
        return price;
    }

    public float price;

    public Beer(String name, String country, float price) {


        this.name = name;
        this.country = country;
        this.price = price;

    }

    public String toString() {
        return "Name: " + name + ", price: " + price;
    }

}

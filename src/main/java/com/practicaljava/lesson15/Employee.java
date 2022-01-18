package com.practicaljava.lesson15;

import java.io.Serializable;

public class Employee implements Serializable {

    public String lName;
    public String fName;
    transient public int salary;

//    PromotionHistory promos;

}

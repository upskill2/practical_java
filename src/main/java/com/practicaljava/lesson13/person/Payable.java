package com.practicaljava.lesson13.person;

    public interface Payable {

        boolean increasePay(int percent);

        final int INCREASE_CAP = 20;

    }


package com.practicaljava.lesson13.person2;

@FunctionalInterface
public interface Payable {
    int INCREASE_CAP = 20;
    boolean increasePay(int percent);
}

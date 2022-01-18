package com.practicaljava.lesson13.taxfunction;

@FunctionalInterface
public interface TaxFunction {
    double calcTax (double grossIncome);
}

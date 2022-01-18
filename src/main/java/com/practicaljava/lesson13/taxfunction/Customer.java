package com.practicaljava.lesson13.taxfunction;

public class Customer {

    public String name;
    public double grossIncome;

    public void applyTaxCalcFunction (TaxFunction taxFunction) {

        double calculatedTax = taxFunction.calcTax(grossIncome);
        System.out.println("The calculated tax for " + name +
                " is " + calculatedTax);
    }
}

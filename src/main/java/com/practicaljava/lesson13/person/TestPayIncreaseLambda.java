package com.practicaljava.lesson13.person;

public class TestPayIncreaseLambda {

    public static void main(String[] args) {

        Person workers[] = new Person[4];
        workers[0] = new Person("John", 'E');
        workers[1] = new Person("Mary", 'C');
        workers[2] = new Person("Steve", 'E');
        workers[3] = new Person("Taras", 'F');

        // Lambda expression for increasing Employee's pay
        Payable increaseRulesEmployee = (int percent) -> {
            return true;
        };

        // Lambda expression for increasing Contractor's pay
        Payable increaseRulesContractor = (int percent) -> {
            if (percent > Payable.INCREASE_CAP) {
                System.out.print(" Sorry, can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%. ");
                return false;
            } else {
                return true;
            }

        };

        // Lambda expression for increasing Foreigner's pay
        Payable increaseRulesForeignWorker = (int percent) -> {
            if (percent > Payable.INCREASE_CAP * 2) {
                System.out.print(" Sorry, can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%. ");
                return false;
            } else {
                return true;
            }

        };

        for (Person p : workers) {
            if ('E' == p.getWorkerStatus()) {
                // Validate 30% increase for every worker
                p.validatePayIncrease(increaseRulesEmployee, 30);
            } else if ('C' == p.getWorkerStatus()) {
                p.validatePayIncrease(increaseRulesContractor, 30);
            } else if ('F' == p.getWorkerStatus()) {
                p.validatePayIncrease(increaseRulesForeignWorker, 40);
            }
        }
    }

}


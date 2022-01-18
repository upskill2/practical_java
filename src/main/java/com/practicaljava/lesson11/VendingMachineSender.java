package com.practicaljava.lesson11;

import java.util.BitSet;

public class VendingMachineSender {

    public static void main(String args[]) {
        BitSet report = new BitSet();
        report.set(2); // box is full
        report.set(4); // no Coca-Cola
    }
}

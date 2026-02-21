package com.blackrock.retirement_saving.util;

public class CalculationUtil {
    public static double calculateCeiling(double amount) {
       return Math.ceil(amount / 100.0) * 100.0;
       
    }

    public static double calculateRemanent( double amount) {
        double ceiling = calculateCeiling(amount);
        return ceiling - amount;
    }
}

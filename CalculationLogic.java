package com.nit.predicate;

import java.util.function.Predicate;

public class CalculationLogic {
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        Predicate<Integer> isGreaterThanTen = num -> num > 10;
        
        Predicate<Integer> isPrime = num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        };
        
        int num=9;
        boolean evencheck=isEven.test(num);
        IO.println(evencheck);
        
        
        boolean isgreat=isGreaterThanTen.test(num);
        IO.println(isgreat);
        
        boolean primecheck=isPrime.test(17);
        IO.println(primecheck);

        
    }
}
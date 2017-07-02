package com.java.codingPracticeProblems;

import java.util.ArrayList;
import java.util.List;
 
public class PowerfulNumber {
 
    public static void main(String[] args) {
        System.out.println("powerfulNums= " + getPowerfulNumbers(1, 40));
    }
 
    public static List<Integer> getPowerfulNumbers(int from, int to) {
        List<Integer> powerfulNums = new ArrayList<Integer>();
        List<Integer> primeNumbers = getPrimeNumbers(from, to);
        for (int m = from; m <= to; m++) {
            boolean isPowerfulNumber = true;
            for (Integer p : primeNumbers) {
                // every p that divides m, p*p must also divide m. 
                if(m % p == 0 && m % (p*p) != 0){
                    isPowerfulNumber = false;
                    break;
                }
            }
            
            if(isPowerfulNumber){
                powerfulNums.add(m);
            }
        }
 
        return powerfulNums;
    }
 
    private static List<Integer> getPrimeNumbers(int from, int to) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (int number = from; number <= to; number++) {
            if(isPrime(number)){
                primeNumbers.add(number);
            }
        }
 
        return primeNumbers;
    }
 
    private static boolean isPrime(int number) {
        if (number % 2 == 0 || number == 1) {
            return (number == 2);
        }
        
        for (int i = 3; i * i <= number; i += 2) {
            // divisible by other than itself
            if (number % i == 0){
                return false;
            }
        }
 
        return true;
    }
     
} 

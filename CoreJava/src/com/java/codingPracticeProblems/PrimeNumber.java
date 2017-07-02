package com.java.codingPracticeProblems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

   public static void main(String[] args) {
        System.out.println("Prime numbers=" + getPrimeNumbers(1, 200));
   }

   public static List<Integer> getPrimeNumbers(int from, int to) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (int number = from; number <= to; number++) {
            if(isPrime(number)){
                primeNumbers.add(number);
            }
        }

        return primeNumbers;
    } 

    private static boolean isPrime(int number) {
        // even numbers stop here. 
        // Only 2 is an even prime number & the first prime number
        // 1 is not a prime number
        if (number % 2 == 0 || number == 1) {
            return (number == 2);
        }

        int count = 0;
        // odd numbers from 3 to n get here
        // goes inside a loop only if i*i <= number
        // so, numbers 3, 5, 7 skip this for loop
        // 9, 11, 13, 15, etc get in as 3*3 = 9, 3*3 < 11, and so on
        for (int i = 3; i * i <= number; i += 2) {
            System.out.println("i=" + i);
            count++;
            // divisible by other than itself
            if (number % i == 0){
                return false;
            }
        }
        
        System.out.println("count=" + count);

        // if gets here, it is a prime
        return true;
    }  
    
    /*
     * private static boolean isPrime(int number) {
        // even numbers stop here.
        // Only 2 is an even prime number & the first prime number
        // 1 is not a prime number
        if (number % 2 == 0 || number == 1) {
            return (number == 2);
        }

        int i = 2;
        while (i < Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }

        // if gets here, it is a prime
        return true;
} 

public static boolean isPrimeNaive(int number) {
    if (number % 2 == 0 || number == 1) {
        return (number == 2);
    }
    
    //if the number is divisible by other than itself (i.e number) 
    //it is not a prime    
    for (int i = 3; i < number; i++) {
        if(number % i == 0){
           return false;
        }
    }
        
    return true;      
} 
     */
} 

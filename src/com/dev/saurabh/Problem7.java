/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 */
package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

import java.util.ArrayList;

public class Problem7 {


    /**
     * @param args
     */
    public static void main(String[] args) {

        int targetNumber = 10000;
        //2 is prime, now look for 10000th term

        ArrayList<Integer> initialPrimeNumbers = new ArrayList<Integer>();
        for (int num = 3; initialPrimeNumbers.size() <= targetNumber - 1; num = num + 2) {
            boolean wasPrime = true;
            int numberToCheckTill = (int) Math.sqrt(num);
            for (int i = 3; i <= numberToCheckTill; i = i + 2) {

                if ((num % i) == 0) {
                    wasPrime = false;
                    //number is not prime
                    break;
                }
            }

            if (wasPrime)
                initialPrimeNumbers.add(num);
        }

        System.out.println(initialPrimeNumbers.get(initialPrimeNumbers.size() - 1));
    }

}

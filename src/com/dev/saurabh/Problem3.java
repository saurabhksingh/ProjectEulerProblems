package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem3 {

    private static final ArrayList<Integer> initialPrimeNumbers = new ArrayList<Integer>();

    static {

        initialPrimeNumbers.add(2);
        //initialPrimeNumbers.add(5);
        for (int num = 3; num < 10000002; num = num + 2) {
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
    }

    public static void main(String[] args) {
        BigInteger remainder = null;
        BigInteger problemNumber = new BigInteger("600851475143");
        for (int prime : initialPrimeNumbers) {
            remainder = problemNumber.remainder(new BigInteger("" + prime));
            if (remainder.intValue() == 0) {
                problemNumber = problemNumber.divide(new BigInteger("" + prime));
                System.out.println(prime);
            }
        }

    }

}

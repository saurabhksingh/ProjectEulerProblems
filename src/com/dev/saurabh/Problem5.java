/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
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

public class Problem5 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int product = 16;
        int numberToLookUpTo = 20;
        for (int num = 3; num <= numberToLookUpTo; num = num + 2) {
            boolean wasPrime = true;
            int numberToCheckTill = (int) Math.sqrt(num);
            for (int i = 3; i <= numberToCheckTill; i = i + 2) {

                if ((num % i) == 0) {
                    wasPrime = false;
                    //number is not prime
                    break;
                }
            }

            if (wasPrime) {
                System.out.println("Number is " + num + " Product is:" + product);
                int tempNum = num;
                while (tempNum <= numberToLookUpTo)
                    tempNum = tempNum * num;
                tempNum = tempNum / num;
                if (product % tempNum != 0) {
                    System.out.println("tempNum is " + tempNum);
                    product = product * tempNum;
                }

            }
        }

        System.out.println(product);

    }

}

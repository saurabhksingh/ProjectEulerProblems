/**
 * The sum of the squares of the first ten natural numbers is,

 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural
 numbers and the square of the sum is 3025  385 = 2640.

 Find the difference between the sum of the squares of the first one
 hundred natural numbers and the square of the sum.
 */
package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

public class Problem6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /**
         * on calculation result is [n * (3n +2) * (n-1) * (n+1)]/12
         */
        int targetNumber = 100;
        int numerator = targetNumber * (3 * targetNumber + 2) * (targetNumber - 1) * (targetNumber + 1);
        int denom = 12;

        System.out.println(numerator / denom);

    }

}

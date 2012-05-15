/**
 * This code is create and owned by Saurabh Kumar Singh (saurabh.nsit@gmail.com) under MIT License
 */
package com.dev.saurabh;

public class BelowKDivide3Or5 {

    public static void main(String args[]) {

        int sum = 0;

        for (int i = 0; i < 1000; i = i + 3) {

            sum = sum + i;
        }

        for (int j = 0, k = 0; j < 1000; j = j + 5, k++) {

            if (k == 3) {
                //reset k
                k = 0;
            } else {
                sum = sum + j;
            }
        }


        System.out.println(sum);
    }

}

/**
 * This code is create and owned by Saurabh Kumar Singh (saurabh.nsit@gmail.com) under MIT License
 */
package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

public class Problem1 {

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

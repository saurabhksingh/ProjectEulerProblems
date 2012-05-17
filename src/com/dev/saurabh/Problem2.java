package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

public class Problem2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int first = 2;
        int second = 8;
        int sum = first + second;

        while (true) {
            int next = first + 4 * second;
            first = second;

            if (next > 4000000) {
                System.out.println("first: " + first + "  second:" + second);
                break;
            }

            second = next;
            sum = sum + second;
        }


        System.out.println("second:" + second + "  sum:" + sum + "  first:" + first);
    }

}

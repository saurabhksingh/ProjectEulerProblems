package com.dev.saurabh;

public class EvenFibonacci {

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

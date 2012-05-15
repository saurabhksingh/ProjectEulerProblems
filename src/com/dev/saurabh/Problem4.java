package com.dev.saurabh;

public class Problem4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int largetPalindrome = 0;
        int first = 0, second = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j >= 100; j--) {

                int result = i * j;
                String firstHalf = "" + result / 1000;
                String secondHalf = "" + result % 1000;
                secondHalf = new StringBuilder(secondHalf).reverse().toString();
                if (firstHalf.equals(secondHalf)) {
                    if (result > largetPalindrome) {
                        first = i;
                        second = j;
                        largetPalindrome = result;
                    }
                }
            }
        }

        System.out.println("first:" + first + " second:" + second + " " + largetPalindrome);

    }

}
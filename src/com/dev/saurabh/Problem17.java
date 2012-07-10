package com.dev.saurabh;

/**
 * Copyright (c)
 * User: saurabh
 * Date: 7/11/12
 * Time: 12:28 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
public class Problem17 {
    /**
     *
     * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

     If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


     NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
     (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
     */

    private static final int finalNumSeparator = 3;//"and";
    private static final int hundredCount = 7;
    private static final int thousandCount = 8;

    private static final int [] wordTokenSize = new int[] {
            3, /*one*/ 3,/*two*/5,/*three*/  4,/*four*/ 4,/*five*/ 3,/*six*/
            5,/*seven*/ 5,/*eight*/ 4/*nine*/, 6/*eleven*/, 6/*twelve*/, 8 /*thirteen*/,
            8,/*fourteen*/ 7,/*fifteen*/ 7,/*sixteen*/ 9,/*seventeen*/  8,/*eighteen*/ 8/*nineteen*/, 3/*ten*/, 6/*twenty*/,
            6/*thirty*/, 5/*forty*/, 5/*fifty*/, 5/*sixty*/, 7/*seventy*/, 6/*eighty*/, 6/*ninety*/
    };

    public static void main(String [] args)  {

        long sum = 0;
        int upperLimit = 1000;

        for(int i=1; i<upperLimit; i++){

            sum += getWordRepresentationSum(i);
        }
        sum += 11;//one thousand
        System.out.println(sum);
    }

    private static int getWordRepresentationSum(int input) {
        int result = 0;
        if(input >= 100 ){
            if(input % 100 > 0){
                result += finalNumSeparator;
            }
            int digitAtHundredPos = input / 100;
            result += wordTokenSize[digitAtHundredPos-1];//one to nine
            result += hundredCount;
            input = input%100;
        }
        if(input >= 10 && input < 100){
            int digitAtTenPosition = input / 10;
            if(input > 10 && input < 20){
                result += wordTokenSize[input - 2];
                input = 0;
            }
            else {
                //ten,twenty,thirty....
                result += wordTokenSize[digitAtTenPosition+17];
                input = input%10;
            }
        }
        if(input > 0 && input < 10){
            result += wordTokenSize[input-1];
        }

        return result;
    }
}

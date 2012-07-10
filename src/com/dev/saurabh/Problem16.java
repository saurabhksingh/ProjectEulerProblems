package com.dev.saurabh;

import java.math.BigInteger;

/**
 * Copyright (c)
 * User: saurabh
 * Date: 7/11/12
 * Time: 12:19 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
public class Problem16 {

    public static void main(String [] args) throws Exception{

        BigInteger bigInteger = new BigInteger("2");
        bigInteger = bigInteger.pow(1000);

        char [] numInString = bigInteger.toString().toCharArray();
        int sum = 0;
        for(char ch : numInString){
            sum += ch-'0';
        }

        System.out.println(sum);
    }
}

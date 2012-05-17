package com.dev.saurabh;

import java.util.ArrayList;

/**
 * Developer : Saurabh Kumar Singh
 * Date: 18/5/12
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */
public class Problem10 {
    /**
     * Problem:
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     Find the sum of all the primes below two million.
     */

   public static void main(String [] args){
       long startTime = System.currentTimeMillis();
       boolean [] primeRecord = new boolean[1000000];     //[0] is 3, [1] is 5, [2] is 7.....(index+1)*2 + 1
       //for 3 at [0]odd multiples are 9, 15, 21, 27...index will be 3, 6, 9,.....
       //for 5 at [1] odd multiples are 15, 25, 35, 45...index will be 6, 11, 16.....
       long sum = 2;
       int index = 0;
       //doing Seive
       for (int num = 3; num < 2000000; num = num + 2) {
          int currentIndex = num+index;
          while(currentIndex < primeRecord.length){
              if(!primeRecord[currentIndex]){
                  primeRecord[currentIndex] = true;
              }
              currentIndex = num+currentIndex;
          }

          index++;

       }
       for(int i=0; i<primeRecord.length; i++){
           if(!primeRecord[i]){
               sum = sum + (i+1)*2 + 1;
           }
       }
       System.out.println("Time taken is:"+(System.currentTimeMillis()-startTime)+", Sum is:"+sum);
   }
}

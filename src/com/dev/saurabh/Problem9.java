package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

/**
 * Problem:
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
public class Problem9 {
    private static final int SUM = 1000;
    /**
     * a2 + b2 + 2*a*b = 10^6+ c2 - 2000c
     * abc = 5*10^5c- 10^3c2
     * abc>0
     * c<500
     * so a<b<c<500
     * also c > 333 => 333<c<500.
     *
     * a^2 = x^2 - y^2, b^2=2*x*y, c=x^2+y^2 [as they fulfill pythagoras condition]
     * adding all x*(x+y) = 500
     * now x>y (as x^2 - y^2 is +ve)
     * so x<22 (as 23^2 > 500)
     *
     * */

    public static void main(String [] args){

          int twoNumMultiple = SUM / 2;
          int startPoint = (int)Math.sqrt(twoNumMultiple);
          int numFound = 1;
          for(int i=startPoint ; i>=1; i--){
              if(twoNumMultiple % i == 0){
                  startPoint = i;
                  numFound = twoNumMultiple/startPoint - startPoint;

                  break;
              }
          }


          int firstNum = (startPoint * startPoint) - (numFound * numFound);
          int secondNum = 2 * startPoint * numFound;
          int thirdNum = (startPoint * startPoint) + (numFound * numFound);

          System.out.println(firstNum * secondNum * thirdNum);
    }

 }

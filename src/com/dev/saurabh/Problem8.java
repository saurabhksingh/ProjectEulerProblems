/**
 * Find the greatest product of five consecutive digits in the 1000-digit number.

 73167176531330624919225119674426574742355349194934
 96983520312774506326239578318016984801869478851843
 85861560789112949495459501737958331952853208805511
 12540698747158523863050715693290963295227443043557
 66896648950445244523161731856403098711121722383113
 62229893423380308135336276614282806444486645238749
 30358907296290491560440772390713810515859307960866
 70172427121883998797908792274921901699720888093776
 65727333001053367881220235421809751254540594752243
 52584907711670556013604839586446706324415722155397
 53697817977846174064955149290862569321978468622482
 83972241375657056057490261407972968652414535100474
 82166370484403199890008895243450658541227588666881
 16427171479924442928230863465674813919123162824586
 17866458359124566529476545682848912883142607690042
 24219022671055626321111109370544217506941658960408
 07198403850962455444362981230987879927244284909188
 84580156166097919133875499200524063689912560717606
 05886116467109405077541002256983155200055935729725
 71636269561882670428252483600823257530420752963450
 */
package com.dev.saurabh;

/**
 * Developer : Saurabh Kumar Singh
 * Copyright of the code is owned by Saurabh Kr Singh (saurabh.nsit@gmail.com)
 * You are free to use this code either in free/commercial
 * product. However anytime my code is used please mention
 * and give credit to my name and e-mail id.
 */

public class Problem8 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String inputData = "7316717653133062491922435119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";


        char[] input = inputData.toCharArray();

        int[] inputIntArray = new int[input.length];


        int product = 1;
        for (int i = 0; i < input.length; i++) {
            inputIntArray[i] = input[i] - '0';
        }

        int largestProduct = 0;
        int startPoint =  0;
        for(int i=0; i<input.length-5; i++)
        {
            if(inputIntArray[i]!=0 && inputIntArray[i+1]!=0 && inputIntArray[i+2]!=0 &&  inputIntArray[i+3]!=0 && inputIntArray[i+4]!=0 ){
                startPoint = i;
                largestProduct =  inputIntArray[i] * inputIntArray[i+1] * inputIntArray[i+2] * inputIntArray[i+3]* inputIntArray[i+4];
                break;
            }
        }

        int tmpProduct = largestProduct;
        boolean isContinuityMaintained = true;
        System.out.println(startPoint);
        for(int i=startPoint+9; i<input.length;){
            System.out.println(i);
            if(inputIntArray[i]==0 || inputIntArray[i-1]==0 || inputIntArray[i-2]==0 ||  inputIntArray[i-3]==0 || inputIntArray[i-4]==0 ) {
                int increment = 1;
                if(inputIntArray[i-3]==0) increment = 2;
                else if(inputIntArray[i-2]==0) increment = 3;
                else if(inputIntArray[i-1]==0) increment = 4;
                i = i+increment;
                isContinuityMaintained = false;
            }
            else{
                if(isContinuityMaintained){
                    tmpProduct = (tmpProduct/inputIntArray[i-5]) * inputIntArray[i];
                    if(tmpProduct > largestProduct){
                        largestProduct = tmpProduct;
                    }
                }
                else{
                    if((i+4) < inputIntArray.length){
                        tmpProduct = inputIntArray[i] * inputIntArray[i-1] * inputIntArray[i-2] *  inputIntArray[i-3] * inputIntArray[i-4];
                        if(tmpProduct > largestProduct){
                            largestProduct = tmpProduct;
                        }
                    }
                    isContinuityMaintained = true;
                }
                i++;
            }
        }

        System.out.println(largestProduct);
    }

}

package Oop;

import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {



        int nums [] = {0,9,6,7,3,33,8,10,};


        System.out.println(Arrays.toString(nums));

        /*
        int lnum = nums [0];

        for (int i = 0; i < nums.length; i++) {
            if(lnum < nums[i])
                lnum = nums[i];

        }
        System.out.println(lnum);

         */


       /*
        int numbers [] = { 1,3,6,2,7,3,4,20,21,30,15,11};


        int largestnumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

                    if(largestnumber < numbers[i])
                        largestnumber = numbers[i];

                }
                System.out.println(largestnumber);


                int copy[] = numbers.clone();
                for (int i = 0; i < copy.length; i++) {

                    System.out.print(copy[i] + "\t");

                }


        int valueNow = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1; j < numbers.length; j++){

                if(numbers[i] < numbers[j]){

                    valueNow = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = valueNow;

                }


            }

                
            }
            for (int i = 0; i < numbers.length; i++) {

                System.out.print(numbers[i]+"\t");


        }


    }

        */
    }
}

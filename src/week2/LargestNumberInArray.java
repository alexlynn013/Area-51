package week2;

import java.util.Arrays;

public class LargestNumberInArray {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 23,6,8};
        int max = numbers[0];
        for (int i= 0; i < numbers.length; i++){
            if(numbers[i] > max )
                max = numbers[i];

        }
        System.out.println(max);

        int[] numbers2 = {1, 2, 3, 4, 5, 23,6,8};
        int min = numbers2[0];
        for (int i= 0; i > numbers2.length; i++){
            if(numbers2[i] < min )
                min = numbers2[i];

        }
        System.out.println(min);


        int [] num1 = numbers2.clone();
        for (int i=0; i<num1.length; i++)
        System.out.print(num1[i]+"\t");


        /*
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Largest element is: "+ max);

         */


    }
}

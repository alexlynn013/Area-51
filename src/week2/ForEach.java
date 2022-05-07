package week2;

import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 23};

        for (int number : numbers) { // for (int new : array name)

            //System.out.println(number); // for each
        }

        int[][] num1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] num2 = {

                {1, 2, 5, 7, 12},
                {2, 9, 11, 6, 8},
                {6, 5, 4, 3, 2}

        };

/*
        for (int i = 0; i < num2.length; i++) {

            for (int j = 0; j < num2[i].length; j++) {

                System.out.print(num2[i][j] + ",");

            }

        }

 */

        for (int[] ints : num2) {
            for (int i : ints) {
                System.out.print(i+"\t");

            }
            System.out.println();


        }






    }
}


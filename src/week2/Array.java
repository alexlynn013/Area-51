package week2;

public class Array {
    public static void main(String[] args) {

        int [] numbers = { 1,2,3,4,5,23}; //array side with value;

        System.out.println(numbers[2]);

        System.out.println(numbers); // can't add and can't mention array set

        numbers[3] = 20;
        System.out.println(numbers[3]);


        int  fruits [] = new int[5]; //declare array side;
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);


        for (int i = 0; i < fruits.length; i++) {

            System.out.println(fruits[i]);

            for (int i1 = fruits.length - 1; i1 >= 0; i1--) {

                System.out.println(fruits[i1]);

            }

        }




    }
}

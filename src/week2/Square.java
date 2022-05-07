package week2;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Intiger");

        double a = obj.nextInt();
        System.out.println("This is your square root Number " + Math.sqrt(a));
    }
}

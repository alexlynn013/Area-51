package week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);

        System.out.println("Put Your Object Width");
        int width = obj.nextInt();
        System.out.println ("your object width = " + width );


        System.out.println("Put Your Object Height");
        int height = obj2.nextInt();
        System.out.println("Put your object height = " + height);

        int area = width * height;
        System.out.println("Area of rectangle " + area);
    }
}

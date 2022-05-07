package week2;

import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {
        int r;
        double pie = 3.14, ar;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        ar = pie * r * r;
        System.out.println("Area of circle:" + ar);
    }
}

package week2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int num1;
        int num2;
        double ans;
        String operation;

        Scanner input = new Scanner(System.in);
        System.out.println("plz enter the first number");
        num1 = input.nextInt();

        System.out.println("plz enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Plz enter operation");
        operation = op.nextLine();


        switch (operation){

            case "+": ans = num1 + num2;

            System.out.println("your answer is " + (ans));
            break;


            case "-": ans = num1 - num2;
            System.out.println("your answer is " + (ans));
            break;

            case "*": ans = num1 * num2;
            System.out.println("your answer is " + (ans));
            break;

            case "/": ans = num1 / num2;
            System.out.println("your answer is " + (ans));
            break;

            default:
                System.out.println("Put the correct number!");
        }
    }
}

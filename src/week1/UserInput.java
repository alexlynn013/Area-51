package week1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your number: "); // delete "ln" from println for next line
        int abc = obj.nextInt();
        if (abc == 123){
            System.out.println("your number is correct");
        }else{
            System.out.println("your number is wrong");
        };





    }

}

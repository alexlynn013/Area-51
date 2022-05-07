package week2;

import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {
    /*
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Name - ");

        String a = obj.nextLine();


     */
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter Your Number");

     int a = obj.nextInt();

     if(a % 2 == 0 ){ // if you want to check even dive your obj with 2

         System.out.println("Your Number is Even.");

     }else{
         System.out.println("Your Number is Odd.");
     }


    }

}

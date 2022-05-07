package week2;

import java.util.Scanner;

public class leap { //leap year

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int year = obj.nextInt();
        if(year % 4 == 0){

            System.out.println(year + " is Leap Year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}

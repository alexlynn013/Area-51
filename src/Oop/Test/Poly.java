package Oop.Test;

public class Poly { //overload method for poly

    /*
    int sum (int a){
        return (a + a);
    }
    int sum(int a, int b){

        return a+b;
    }
    double sum (double b){
        return b+b+b;
    }
    double sum (int a, double b){
        return a+b;
    }

    double sum (double a, int b){
        return a+b;
    }

     */

    void sum ( int a, long b){
        System.out.println(a+b);
    }
    void sum ( long a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Poly poly = new Poly();
        /*
        System.out.println(poly.sum(20,30));
        System.out.println();
        System.out.println(poly.sum(35.6));
        System.out.println(poly.sum(30,75.0));
        System.out.println(poly.sum(36.4,12));

         */
        poly.sum(8, 88L);
        poly.sum(90L,5);


    }
}

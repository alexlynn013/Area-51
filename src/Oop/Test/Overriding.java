package Oop.Test;


import Oop.sum;

class A{
    void sum(int a){
        System.out.println(a+a);
    }

}
class B extends A{

    @Override
    void sum(int a) {
        super.sum(a);//use from parent class
        System.out.println(a);
    }
}

public class Overriding { // must be inheritance

    public static void main(String[] args) {
        B obj = new B();
        obj.sum(30);




    }
}

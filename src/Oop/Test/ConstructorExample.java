package Oop.Test;

public class ConstructorExample {


    ConstructorExample(int a){
        System.out.println(a);
    } //parameterized Constructor
    public static void main(String[] args) {

        ConstructorExample Obj = new ConstructorExample(7);
        ConstructorExample Obj2 = new ConstructorExample(9);

        System.out.println(Obj);
        System.out.println(Obj2);

    }
}

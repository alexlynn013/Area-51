package Oop;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
    class   Person {
        static int age;
        String name;


        Person(int a, String n) {

            age = a;
            name = n;

        }
    }

public class Constructor {
    public static void main(String[] args) {
        new Person(20,"Super");

        System.out.println(Person.age);
    }

}

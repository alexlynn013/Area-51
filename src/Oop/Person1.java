package Oop;

class User{
    String name = "Yoyo";
    int num3 = 15;
}

class A extends User{ //inheritance keyword is extends

    int num4 = 40;

    public static void main(String[] args) {
        A a = new A(); // create obj for inheritance
        System.out.println(a.num3 + a.num4);
        System.out.println();
        System.out.println(a.name +" "+ a.num3);
    }
}

// single inheritance
// multi level inheritance
// hierarchy
// hybrid inheritance

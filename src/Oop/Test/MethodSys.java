package Oop.Test;


class C{
    void Str(String abc){

    }

}
class D extends C{

    @Override
    void Str(String abc) {
        super.Str(abc);
        float cc = abc.length();
        System.out.println(cc);
    }

    public static void main(String[] args) {
        D objc = new D();
        objc.Str("Hello");




    }
}




public class MethodSys {





}

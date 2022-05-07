package week1;

public class Operator {
    public static void main(String[] args) {

        /*
        int numb1 = 16;
        int numb2 = 5;

        int result = numb1 / numb2;
        int result2 = numb1 % numb2;

        System.out.println(result);
        System.out.println(result2);
        System.out.println("Hello"+(1+2));

       int aa = 5;
       int bb = 4;

        boolean flat1 = aa > bb && aa < bb; // && need to both same correct
        boolean flat2 = aa > bb || aa < bb; // || doesn't need to both same and will print out

        System.out.println(flat1);
        System.out.println(flat2);


         */

        boolean cc = false ^ false; // same = 0, different = 1
        boolean dd = false ^ true;
        boolean ee = true ^ false;
        boolean ff = true ^ true;

        boolean gg = false | false; //
        boolean hh = false | true;
        boolean ii = true | false;
        boolean jj = true | true;

        System.out.println(cc);
        System.out.println(dd);
        System.out.println(ee);
        System.out.println(ff);
        System.out.println(gg);
        System.out.println(hh);
        System.out.println(ii);
        System.out.println(jj);



        /*

        0 0 0 0 1
        0 0 0 0 1
        0 0 0 1 0
        0 0 0 1 1
        0 0 1 0 0
        0 0 1 0 1
        0 0 1 1 0
        0 0 1 1 1
        0 1 0 0 0

         */
    //shift operator, >> right shift , << left shift

        int dum = 10 << 2 ; // if move to shift give power the times, 2 = 2*2, 3 =2*3:

        int dum2 = 10 >> 2; // if move to right dive power the times
        int dum3 = 10 >> 3;

        System.out.println(dum3);

        System.out.println(dum2);

        System.out.println(dum);





    }
}

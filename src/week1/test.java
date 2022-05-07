package week1;

import week2.Array;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Code");
        int abc = obj.nextInt();
        if (abc == 979) {

            String[] packs = {
                    "၁. ပါဝါ load",
                    "၂. ပက်ကေ့ချ်များ",
                    "၃. မိမိအကောင့်",
                    "၄. ဘေလ်အကူအညီ",
                    "၅. ဆက်တင်",
                    "၀. English"
            };

            Arrays.stream(packs).forEach(System.out::println); //first stage

            /////////////////

            Scanner code = new Scanner(System.in);
            int pk1 = code.nextInt();

            String[] packa = {

                    "၁. ၁၉၉၉ကျပ် - ၉၆၅mb - ရက် ၃၀",
                    "၂. ၉၉၉ကျပ် - ၄၈၀mb - ရက် ၇",
                    "၃. ၉၉၉ကျပ် - ၄၆၈၀စက္ကန့် - ရက် ၁၅",
                    "၄. ၂၉၉၉ကျပ် - ၁၄၄၅mb - ရက် ၃၀",
                    "၅. ၁၉၉၉ကျပ် - ၉၃၀၀စက္ကန့် - ရက် ၃၀",
                    "၀. ပြန်ထွက်"

            }; // for packa

            Scanner code2 = new Scanner(System.in);
            int pk2 = code2.nextInt();

            String[] packb = {

                    "၁. ဖုန်းခေါ်",
                    "၂. ဒေတာ",
                    "၃. Night/FBဒေတာ",
                    "၄. သံစဉ်",
                    "၅. နိုင်ငံတကာ",
                    "၀. ပြန်ထွက်"

            }; // for packb
            String[] packc = {

                    "၁. လက်ကျန်စစ်ဆေးရန်",
                    "၂. ပယ်ဖျက်ရန်",
                    "၃. ဆင်းကဒ်မှတ်ပုံတင်စစ်ဆေးရန်",
                    "၄. ပုံမှန်ပလန်",
                    "၅. ဝယ်ယူထားသော Rate Cutter များ",
                    "၀. ပြန်ထွက်"

            }; // for packc


            switch (pk1) {


                case 1:
                    Arrays.stream(packa).forEach(System.out::println);
                    Scanner code1a = new Scanner(System.in);
                    int pka1 = code1a.nextInt();

                    String[] packa1 = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    while (pka1==1){
                    Arrays.stream(packa1).forEach(System.out::println);
                    break;};

                case 2:
                    Arrays.stream(packb).forEach(System.out::println);
                    String[] packa2 = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packa2).forEach(System.out::println);
                    break;
                case 3:
                    Arrays.stream(packc).forEach(System.out::println);
                    String[] packa3 = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packa3).forEach(System.out::println);
                    break;
                case 0:
                    Arrays.stream(packs).forEach(System.out::println);
                    break;

                default:
                    System.out.println("please put correct number");

            }









            ////////


            } else {
                System.out.println("your number is wrong");
            }
            ;
        }
    }




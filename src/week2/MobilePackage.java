package week2;

import java.util.Arrays;
import java.util.Scanner;

public class MobilePackage {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Code");
        int abc = obj.nextInt();

        if ( abc == 979 ){


            String[] packs = {
                    "၁. ပါဝါ load",
                    "၂. ပက်ကေ့ချ်များ",
                    "၃. မိမိအကောင့်",
                    "၄. ဘေလ်အကူအညီ",
                    "၅. ဆက်တင်",
                    "၀. English"
            };

            Arrays.stream(packs).forEach(System.out::println); //first stage

            Scanner packa = new Scanner(System.in);
            int packa1 = packa.nextInt();


            if (packa1 == 1){

                    String[] pack1a = {

                            "၁. ၁၉၉၉ကျပ် - ၉၆၅mb - ရက် ၃၀",
                            "၂. ၉၉၉ကျပ် - ၄၈၀mb - ရက် ၇",
                            "၃. ၉၉၉ကျပ် - ၄၆၈၀စက္ကန့် - ရက် ၁၅",
                            "၄. ၂၉၉၉ကျပ် - ၁၄၄၅mb - ရက် ၃၀",
                            "၅. ၁၉၉၉ကျပ် - ၉၃၀၀စက္ကန့် - ရက် ၃၀",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(pack1a).forEach(System.out::println);
                    Scanner packaa1 = new Scanner(System.in);
                    int pack1aa = packaa1.nextInt();
                    if (pack1aa == 1){

                        String[] packa1a = {

                                "၁. ဝယ်ယူရန်",
                                "၀. ပြန်ထွက်"

                        };
                        Arrays.stream(packa1a).forEach(System.out::println);
                        Scanner packaaa = new Scanner(System.in);
                        int packaaa1 = packaaa.nextInt();
                        if (packaaa1 == 1){
                            System.out.println("ဝယ်ယူလုပ်ဆောင်မှု အောင်မြင်ပါသည်");
                        }
                        else{
                            System.out.println("ကျေးဇူးပြု၍မှန်ကန်သော ကုဒ်နံပါတ်ကိုရိုက်ထည့်ပေးပါ");
                        }

                    }
                    if (pack1aa == 2){

                    String[] packa1b = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packa1b).forEach(System.out::println);
                    }
                    if (pack1aa == 3){

                    String[] packa1c = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packa1c).forEach(System.out::println);
                    }
                    if (pack1aa == 4){

                    String[] packa1d = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packa1d).forEach(System.out::println);
                    }
                    if (pack1aa == 5){

                    String[] packa1e = {

                            "၁. ဝယ်ယူရန်",
                            "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packa1e).forEach(System.out::println);
                    }
                     if (pack1aa == 0){

                    Arrays.stream(packs).forEach(System.out::println);
                    }


            }

            if (packa1 ==2){

                String[] pack2a = {

                        "၁. ဖုန်းခေါ်",
                        "၂. ဒေတာ",
                        "၃. Night/FBဒေတာ",
                        "၄. သံစဉ်",
                        "၅. နိုင်ငံတကာ",
                        "၀. ပြန်ထွက်"

                };
                Arrays.stream(pack2a).forEach(System.out::println);
                Scanner pack2 = new Scanner(System.in);
                int packa2a = pack2.nextInt();
                if (packa2a == 1){

                    String[] packaa2 = {

                            "၁. ၁၀ မိနစ် ၉၉ ကျပ်",
                            "၂. ၅၀ မိနစ် ၄၀၀ ကျပ်"

                    };
                    Arrays.stream(packaa2).forEach(System.out::println);
                }
                if (packa2a == 2){

                    String[] packaa2a = {

                            "၁. ၃၅၀ အမ်ဘီ -  ၇၉၉ ကျပ်",
                            "၂. ၄၂၅ အမ်ဘီ - ၉၄၉ ကျပ်"

                    };
                    Arrays.stream(packaa2a).forEach(System.out::println);

                }
                if (packa2a == 3){

                    String[] packaa3a = {

                            "၁. ၃၅၀ အမ်ဘီ -  ၇၉၉ ကျပ်",
                            "၂. ၄၂၅ အမ်ဘီ - ၉၄၉ ကျပ်"

                    };
                    Arrays.stream(packaa3a).forEach(System.out::println);

                }
                if (packa2a == 4){

                    String[] packaa4a = {

                            "၁. ခေါ်ဆိုသူနားဆင်",
                            "၂. ကိုယ်တိုင်နားဆင်",
                            "၃. လူကြိုက်များဆုံးတေးသွား",
                    "၀. ပြန်ထွက်"

                    };
                    Arrays.stream(packaa4a).forEach(System.out::println);

                }

            }

            if (packa1 == 3) {

                String[] pack3a = {

                        "၁. လက်ကျန်စစ်ဆေးရန်",
                        "၂. ပယ်ဖျက်ရန်",
                        "၃. ဆင်းကဒ်မှတ်ပုံတင်စစ်ဆေးရန်",
                        "၄. ပုံမှန်ပလန်",
                        "၅. ဝယ်ယူထားသော Rate Cutter များ",
                        "၀. ပြန်ထွက်"
                };
                Arrays.stream(pack3a).forEach(System.out::println);
            }

            if (packa1 == 4) {

                String[] pack4a = {

                        "၁. ဖုန်းငွေလွှဲရန်",
                        "၂. ကြိုသုံး",
                        "၃. ဖုန်းငွေဖြည့်ရန်",
                        "၀. ပြန်ထွက်"
                };
                Arrays.stream(pack4a).forEach(System.out::println);
            }


        }else{
                        System.out.println("your number is wrong");
                    }
                    ;
                }
            }




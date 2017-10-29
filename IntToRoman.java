package com.OnlineCoding;

import java.util.Scanner;

/**
 * Created by Balaji on 29/10/17.
 */
public class IntToRoman {
    public static void main(String[] args) {
        int a=1;
        while (a!=0) {
            System.out.println("Enter an int below 3999");
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            System.out.println(getRoman(num));

            System.out.println("Enter 1 to continue 0 to exit");
            a=scanner.nextInt();
        }

    }
    public static String intToRoman(int num) {
        return array1To10(num);
    }

    public static String array1To10(int num){
        String[] s1To9={"","I","II","III","IV","V","VI","VII",
                            "VIII","IX","X"};
        String[] s10To100={"","X","XX","XXX","XL","L","LX","LXX",
                            "LXXX","XC","C"};
        String[] s101To1000={"","C","CC","CCC","CD","D","DC","DCC",
                             "DCCC","CM","M"};
        String[] s1001To4999={"","M","MM","MMM","MMMM"};
        if(num<10)
            return s1To9[num];
        if (num>10 && num<=100)
            return s10To100[num/10]+s1To9[num%10];
        if (num>100 && num<=1000)
            return s101To1000[num/100]+s10To100[(num/10)%10]+s1To9[num%10];
        if (num>1000 && num<=5000)
            return s1001To4999[num/1000]+s101To1000[(num/100)%10]+s10To100[(num/10)%10]+s1To9[num%10];
        return null;

    }
        public  static String getRoman(int input){
            String [] roman1={"","I","II","III","IV","V","VI","VII","VIII","IX","X",
                 "X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C",
                "C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M",
                    "M","MM","MMM","MMMM"};
               String result="";
                if(input<10){
                        return roman1[input];
                    }
                if(input>10 &&input<=100) {
                        int left = input / 10;
                        int right = input % 10;
                        result = roman1[10 + left] + getRoman(right);
                        return result;
                    }
                if(input > 100 && input <1000) {
                        int left = input / 100;
                        int right = input % 100;
                        result = roman1[20 + left] + getRoman(right);
                        return result;
                }
                if (input>=1000 && input<5000){
                         int left=input / 1000;
                        int right=input%1000;
                        result=roman1[30+left]+getRoman(right);
                        return result;
                }
                return null;
            }
}

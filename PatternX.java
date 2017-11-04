package com.interiewQuestions;

/**
 * Created by Balaji on 4/11/17.
 */
/* Question
1   5
 2 4
  3
 2 4
1   5
 */
public class PatternX {
    public static void main(String[] args) {
            printPatternX("1234567891234567890123456789123456789");
    }
/*printing Top part
   --> calculate intial space
   --> gap between 2 elements in each line
   --> call print Space method to print initial space & pass int value for space
   --> print the first element
   --> call printSpace method to print gap pass int value for gap
 */

    public static void printPatternX(String s) {
        if (s.length()%2!=0) {
            for (int i = 0; i < s.length() / 2; i++) {
                int gap = (s.length() - 1 - i) - (i + 1);
                System.out.println(printSpace(i) + s.charAt(i) +
                        printSpace(gap) + s.charAt(s.length() - 1 - i));
            }
        /* print middle element
        --> call printSpace method to print initial space
        --> print the middle element.
        */
            System.out.println(printSpace(s.length() / 2) + s.charAt(s.length() / 2));
        /* BL for bottom part
        --> apply all the procedures applied in Top part
        */
            for (int i = (s.length() / 2) - 1; i >= 0; i--) {
                int gap = ((s.length() / 2) + (s.length() / 2) - i - i - 1);
                System.out.println(printSpace(i) + s.charAt(i) + printSpace(gap) +
                        s.charAt(s.length() - 1 - i));
            }
        }
        else
            throw new IllegalArgumentException("Give the string whose length is Odd.");
    }
/*
 BL for printing space and gap..
 --> if you pass 1 it prints one space
 -->if you pass 5 it prints 5 space
*/
    public static String printSpace(int num) {
        String space=" ";
        String res="";
        while (num>0){
            res=res+space;
            num--;
        }
        return res;
    }

}

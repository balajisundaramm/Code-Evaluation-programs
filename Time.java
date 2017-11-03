package com.OnlineCoding;

import java.util.Scanner;

/**
 * Created by Balaji on 2/11/17.
 */
public class Time {
    public static void main(String[] args) {
        int x=1;
        Scanner scanner = new Scanner(System.in);
        while (x!=0) {
            System.out.println("Enter the hour value");
            int hour =scanner.nextInt();
            System.out.println("Enter the min value");
            int min =scanner.nextInt();

            System.out.println(calculateTime(hour,min));

            System.out.println("Enter 1 to continue or 0 to exit");
            x = scanner.nextInt();
        }

    }
    // assigning all numbers needed
    public static String assgnValues(int a) {
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six",
                "seven","eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "ninteen", "twenty","thirty","forty","fifty"};
        return strings[a];
    }
    // validating hour
    public static boolean validateHour(int hour){
        if (hour<0 || hour>24)
            return false;
        return true;
    }
    // validating min
    public static boolean validateMin(int min){
        if (min<0 || min>61)
            return false;
        return true;
    }
    // applying business logic to calcilate hour
    public static String calculateHour(int hour){
            if (hour==24)
                return assgnValues(0);
            if (hour>20 && hour!=24) {
                hour = hour % 20;
                return assgnValues(hour);
            }
            else
                return assgnValues(hour);
    }
    // applying business logic to calculate min and setting all single case checks
    public static String calculateMin(int min){
            if (min < 21 && min != 15)
                return assgnValues(min);
            if (min == 15)
                return "quarter past ";
            if (min == 30)
                return "half past ";
            if (min == 45)
                return "quarter to ";
            if (min > 20 && min < 30) {
                return ((assgnValues((min /20)+ 19)) + assgnValues(min % 20));
            }
            if (min > 30 && min < 40) {
                return ((assgnValues((min /20)+ 20)) + (assgnValues(min % 30)));
            }
            if (min == 40) {
                return (assgnValues((min /20)+ 20));
            }
            if (min > 40 && min < 50 && min != 45) {
                return ((assgnValues((min /20)+ 20)) + (assgnValues(min % 20)));
            }
            if (min == 50) {
                return (assgnValues((min /20)+ 20));
            }
            if (min > 51 && min < 60) {
                return (assgnValues((min /20)+ 21)) + assgnValues(min % 50);
            }
            if (min == 60) {
                return assgnValues(0);
            }
        return null;
    }
    // applying all business logic and validation and calculating time
    public static String calculateTime(int hour, int min){
        if (validateHour(hour) && validateMin(min)) {
            if (min != 15 && min != 30 && min != 45 && min != 60) {
                return calculateHour(hour) + " hour and " + calculateMin(min) +
                        " minutes";

            }
            if (min == 45){
                if (hour!=24){
                    return calculateMin(min) + calculateHour(hour + 1);
                }
                else
                    return calculateMin(min)+calculateHour(1);
            }
            if (min==60){
                if (hour!=24) {
                    return calculateHour(hour + 1) + " hour";
                } else
                    return (calculateHour(1)+ " hour");
            }
        }
        return "Invalid time";
    }
}

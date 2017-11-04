package com.interiewQuestions;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Balaji on 4/11/17.
 */
public class PrimeTillBigInteger {
    public static void main(String[] args) {
        int limit=100;
        System.out.println(findPrimes(limit));
    }

    public static TreeSet<Integer> findPrimes(int limit) {
        TreeSet<Integer> result=new TreeSet<Integer>();
        if (validatePrime(limit)){
            if (limit<2)
                System.out.println("There is no prime upto "+limit);
            if (limit>=2)
                result.add(2);
            if (limit>=3)
                result.add(3);
            for (int i = 3; i <=limit ; i++) {
                if (isPrime(i))
                    result.add(i);
            }
        }
        return result;
    }

    public static boolean validatePrime(int limit) {
        return (limit<0)?false:true;
    }
    public static boolean isPrime(int limit){
        if (limit%2==0)
            return false;
        int range=(int)Math.sqrt(limit);
        for (int i=3; i<=(range+1); i+=2) {
            if (limit%i == 0)
                return false;
        }
        return true;
    }
}

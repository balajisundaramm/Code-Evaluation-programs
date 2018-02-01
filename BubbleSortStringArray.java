package com.spaneos.shoppingcart;

public class Test {
	public static void main(String[] args) {
		String[] strings= {"ad","adc","bc","a"};
		for (String string : bubbleSort(strings)) {
			System.out.println(string);
		}
	}
	
	public static String[] bubbleSort(String[] strings) {
		 int z=0;
	        while(z<strings.length) {
	            for (int i = 1; i < strings.length; i++) {
	                if (compare(strings[i-1],strings[i])>0) {
	                    String temp = strings[i-1];
	                    strings[i-1] = strings[i];
	                    strings[i]= temp;
	                }
	            }
	            z++;
	        }
	        return strings;
	}
	public static int compare(String string1, String string2) {
		int min=((string1.length()<string2.length())?string1.length():string2.length());
		for (int i = 0; i < min; i++) {
			if(string1.charAt(i)!=string2.charAt(i)) {
				return (string1.charAt(i)>string2.charAt(i))?1:-1;
			}
		}
		if(string1.length()!=string2.length())
			return (string1.length()>string2.length())?1:-1;
		else {
			return 0;
		}
	}
}

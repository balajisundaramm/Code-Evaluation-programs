package com.balaji;

/**
 * Created by Balaji on 12/10/17.
 */
public class Pyramid {
    public static void main(String[] args) {
        printPyramid(7);
    }

    public static void printPyramid(int row) {
        for (int i =0; i <row ; i++) {
            for (int colspace = 0; colspace <(row-i) ; colspace++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

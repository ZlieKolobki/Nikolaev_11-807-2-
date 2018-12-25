package com.company;

import java.util.Scanner;

public class Homework5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strC = str.toCharArray();
        for (int i = 0; i < strC.length; i++) {
            if (strC[i] <= 58 & strC[i] >= 49) {
                strC[i] = '*';
            }
        }
        System.out.println(strC);
    }
}

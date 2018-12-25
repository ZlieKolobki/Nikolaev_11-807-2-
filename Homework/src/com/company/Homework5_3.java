package com.company;

import java.util.Scanner;

public class Homework5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        char[] schr = s.toCharArray();
        int x = 0;
        for (int i = 0; i < s.length(); i++){
            x = x + schr[i] - 48;
            if (i != s.length()-1){
                x *= 10;
            }
        }
        System.out.println(x);
    }
}

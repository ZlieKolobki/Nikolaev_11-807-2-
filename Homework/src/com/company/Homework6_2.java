package com.company;

import java.util.Scanner;

public class Homework6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        f1(s);
        System.out.println(s);
    }
    static String f1(String s){
        s = s.replace(" ", "");
        return s;
    }
}

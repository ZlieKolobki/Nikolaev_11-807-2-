package com.company;

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();
        if (f(n)==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    static int f(Double n){
        if (n == 1){
            return 1;
        }
        if (n>1 & n < 2){
            return 0;
        }else{
            return f(n/2);
        }
    }
}

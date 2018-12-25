package com.company;

import java.util.Scanner;

public class Homework7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        f(n, sum);
    }
    static void f(int n, int sum){
        int k = n%10;
        sum += k;
        if (n > 0) {
            f(n / 10, sum);
        }else{
            System.out.println(sum);
        }
    }
}

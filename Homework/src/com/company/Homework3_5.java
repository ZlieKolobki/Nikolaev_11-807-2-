package com.company;

import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = arr[0];
        int y;
        int l;
        for (int i = 1; i < n; i++){
            l = 1;
            y = arr[i];
            while (y > 0){
                l *= 10;
                y /= 10;
            }
            x *= l;
            x += arr[i];

        }
        System.out.println(x);
    }
}

package com.company;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = arr[0];
        int ind = 0;
        for (int i = 0; i < n; i++){
            if (Math.abs(k) < Math.abs(arr[i])) {
                k = arr[i];
                ind = i;
            }
        }
        System.out.println(ind);
    }
}

package com.company;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = 0;
        for (int i =1; i < n-1; i++){
            if (arr[i] > arr[i - 1] & arr[i] > arr[i + 1]){
                k += 1;
                i += 1;
            }
        }
        System.out.println(k);
    }
}

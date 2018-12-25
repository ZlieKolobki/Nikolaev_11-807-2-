package com.company;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++){
            k += arr[i];
        }
        k /= n;
        int c = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] >= k){
                c += 1;
            }
        }
        System.out.println(k);
        System.out.println(c);
    }
}

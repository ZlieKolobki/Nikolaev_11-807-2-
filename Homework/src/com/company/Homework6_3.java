package com.company;

import java.util.Scanner;

public class Homework6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        f1(arr);
    }
    static void f1(int[] arr){
        int k = 1;
        int buf = 0;
        for (int i = 0 ; i < arr.length - 1; i++){
            if (arr[i] == arr[i + 1]){
                k+=1;
            }else {
                if (buf < k) {
                    buf = k;
                }
                k = 1;
            }
        }
        if (k>buf){
            System.out.println(k);
        }else{
            System.out.println(buf);
        }
    }
}

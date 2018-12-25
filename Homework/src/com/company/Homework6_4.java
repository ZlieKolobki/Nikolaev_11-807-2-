package com.company;

import java.util.Scanner;

public class Homework6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(uniq(arr));
    }
    static Boolean uniq(int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length & i != j; j++){
                if (arr[i] == arr[j]){
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
}

package com.company;

import java.util.Scanner;

public class Homework6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        String buf = new String();
        for (int i = 0; i<n;i++){
            strs[i] = sc.next();
        }
        for (int i = 0; i<n; i++){
            int indM = 0;
            for (int j = 0; j<n-i ;j++) {
                if (strs[indM].length() <  strs[j].length()){
                    indM = j;
                }
            }
            buf = strs[indM];
            strs[indM] = strs[n-1-i];
            strs[n-1-i] = buf;
        }
        for (int i =0; i<n;  i++){
            System.out.println(strs[i]);
        }
    }
}

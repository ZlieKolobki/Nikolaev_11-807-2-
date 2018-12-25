package com.company;

import java.util.Scanner;

public class Homework6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер 1 массива:");
        int n1 = sc.nextInt();
        System.out.println("Размер 2 массива:");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Элементы 1 массива:");
        for (int i = 0; i < n1; i ++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n2];
        System.out.println("Элементы 2 массива:");
        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        uniq2(arr1,arr2);
    }
    static void uniq2(int[] arr1,int[] arr2){
        int k = arr1.length + arr2.length;
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j< arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    k -= 2;
                }
            }
        }
        System.out.println(k);
    }
}

package com.company;

import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        Scanner sc2 = new Scanner(System.in);
        int n2 = sc2.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        int l = 0;
        int ind = 0;
        boolean arrin = true;
        for(int i = 0; i < n1 & arrin; i++){
            ind = i;
            if (arr1[i] == arr2[l]){//пересмотреть
                l += 1;
            }else{
                ind = 0;
                l = 0;
            }
            if (l > n2){
                arrin = false;
            }
        }
        if ( arrin){
            System.out.println(ind);
        }else{
            System.out.println("NO");
        }
    }

}

package com.company;

import java.util.Scanner;

public class Homework8_2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите кол-во строк:");
       int m = sc.nextInt();
       System.out.println("Введите кол-во столбцов:");
       int n = sc.nextInt();
       int[][] matrix = new int[m][n];
       for (int i = 0; i < m; i++){
           for (int j = 0; j < n; j++){
               matrix[i][j] = sc.nextInt();
           }
       }
       int maxStr = 0;
       int k = 0;
       int indStr = 0;
       for (int i = 0; i < m; i ++){
           for (int j = 0; j < n; j++){
               k += matrix[i][j];
           }
           if (k > maxStr){
               maxStr = k;
               indStr = i;
           }
           k = 0;
       }
       int maxCol = 0;
       int indCol = 0;
       for (int i = 0; i < n; i++){
           for (int  j = 0; j < m ; j++){
               k += matrix[j][i];
           }
           if (k > maxCol){
               maxCol = k;
               indCol = i;
           }
           k = 0;
       }
        for (int i = 0; i < n; i++){
            if (i== n-1){
                System.out.println(matrix[indStr][i]);
            }else{
                System.out.print(matrix[indStr][i]);
            }

        }
        for (int i = 0; i < m; i++){
            System.out.print(matrix[i][indCol]);
        }
    }
}

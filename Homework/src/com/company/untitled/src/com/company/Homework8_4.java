package com.company;

import java.util.Scanner;

public class Homework8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк:");
        int m = sc.nextInt();
        System.out.println("Введите кол-во столбцов:");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int ind = 0;
        int minStr = matrix[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] < minStr){
                    minStr = matrix[i][j];
                    ind = j;
                }
            }Max(matrix, ind, minStr);
        }
    }
    static void Max(int[][] matrix, int ind, int minStr){
        int max = minStr;
        for (int i = 0; i < matrix.length; i++){
            if (max < matrix[i][ind]){
                max = matrix[i][ind];
            }
        }if (max == minStr){
            System.out.println(minStr);
        }
    }
}

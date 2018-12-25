package com.company;

import java.util.Scanner;

public class Homework8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк 1 матрицы:");
        int m1 = sc.nextInt();
        System.out.println("Введите кол-во столбцов 1 матрицы:");
        int n1 = sc.nextInt();
        int[][] matrix1 = new int[m1][n1];
        System.out.println("Элементы 1 матрицы:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введите кол-во строк 2 матрицы:");
        int m2 = sc.nextInt();
        System.out.println("Введите кол-во столбцов 2 матрицы:");
        int n2 = sc.nextInt();
        int[][] matrix2 = new int[m2][n2];
        System.out.println("Элементы 2 матрицы:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = sc.nextInt();

            }
        }
        //int k = 0;
        if (n1 == m2){
            int[][] matrix3 = new int[m1][n2];
            for (int i = 0; i < m1; i++){
                for (int j = 0; j < n2; j++){
                    matrix3[i][j] = sum(matrix1,matrix2, i, j);
                }
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(matrix3[i][j] + "\t\t");
                }
                System.out.println();
            }
        }

    }
    static int sum(int[][] matrix1, int[][] matrix2,int k, int s){
        int d = 0;
        for (int i = 0; i < matrix1[0].length; i++){
            d += matrix1[k][i] * matrix2[i][s];
        }
        return d;
    }
}

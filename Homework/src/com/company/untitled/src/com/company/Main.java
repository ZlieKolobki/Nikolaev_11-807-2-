package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк(столбцов):");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        boolean isMagic = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0; //сумма главной диагонали
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        int collateralDiagonalSum = 0;

        for (int i = 0; i < n; i++) {//сумма побочной диагонали
            collateralDiagonalSum += matrix[i][n - i - 1];
        }
        if (diagonalSum != collateralDiagonalSum) {
            isMagic = false;
        }
        for (int i = 0; i < matrix.length; i++) { // matrix.length длина столбцов
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {//matrix[0].lenght длина строк
                rowSum += matrix[i][j];
            }
            if (rowSum != diagonalSum) {
                isMagic = false;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int kSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                kSum += matrix[j][i];
            }
            if (kSum != diagonalSum) {
                isMagic = false;
            }
        }
        System.out.println(isMagic);
    }
}


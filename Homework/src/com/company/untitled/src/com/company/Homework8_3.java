package com.company;

import java.util.Scanner;

public class Homework8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк/столбцов:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int c = 1;
        int k = 0;
        int l = 0;
        while (c <= n*n) {
            if (matrix[k][l] == 0) {
                for (int i = l; i < n - l; i++) { // В первом цикле - k строка
                    matrix[k][i] = c;
                    c += 1;
                }
            }
            if (matrix[k+1][n - 1 - l] == 0) {
                for (int i = k + 1; i < n - k; i++) { // В первом цикле - n-1 столбец
                    matrix[i][n - 1 - l] = c;
                    c += 1;
                }
            }
            if (matrix[n - 1 - k][n - 1 - l - 1] == 0) {
                for (int i = n - 1 - l - 1; i >= l; i--) { // В первом цикле - n-1 строка
                    matrix[n - 1 - k][i] = c;
                    c += 1;
                }
            }
            if (matrix[n - 1 - k -1][l] == 0) {
                for (int i = n - 1 - k - 1; i > k; i--) { // В первом цикле - l столбец
                    matrix[i][l] = c;
                    c += 1;
                }
            }
            k += 1;
            l += 1;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}

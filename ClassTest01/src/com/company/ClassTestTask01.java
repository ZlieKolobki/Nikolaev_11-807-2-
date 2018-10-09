package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(getSideDiagonalAsVector(matrix)));
        System.out.println(Arrays.toString(mult(matrix,getSideDiagonalAsVector(matrix))));
    }
    static int[] getSideDiagonalAsVector(int[][] matrix){
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = matrix.length - 1; j > 0; j--){
                arr[i] = matrix[i][j];
            }
        }
        return arr;
    }
    static int[] mult(int[][] matrix, int[] arr){
        int[] arr2 = new int[matrix.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr.length; j ++){
                sum += matrix[i][j] * arr[j];
            }
            arr2[i] = sum;
            sum = 0;
        }
        return arr2;
    }
    static void sortArr(int[] arr){
        int buf;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int indMax = n - 1;
            for (int j = i; j < n; j++) {
                if (Math.abs(arr[indMax]) < Math.abs(arr[j])) {
                    indMax = j;
                }
            }
            buf = arr[indMax];
            arr[indMax] = arr[i];
            arr[i] = buf;
        }
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);;
        }
    }
}

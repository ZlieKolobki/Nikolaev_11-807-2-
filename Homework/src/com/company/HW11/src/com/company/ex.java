package com.company;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(arr[i]);
        }
    }
}

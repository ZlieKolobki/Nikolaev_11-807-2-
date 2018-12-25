package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"};
        sort(arr);
        merge(arr );
    }
    static void sort(String[] arr) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter[] pws = new PrintWriter[26];
        for (int i = 0; i < 26; i++){
            pws[i] = new PrintWriter(new File("out" + arr[i]) + ".txt");
        }
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            String[] sarr = s.split("");
            for (int i = 0; i < 26; i++) {
                if (arr[i].equals(sarr[1])){
                    pws[i].println(s);
                }
            }
            for (int i = 0; i < 26; i++) {
                pws[i].close();
            }
        }
    }
    static void merge(String[] arr) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("in.txt"));
        Scanner[] scanners = new Scanner[26];
        for (int i = 0; i < 26; i++) {
            scanners[i] = new Scanner(new File("out" + arr[i] + ".txt"));
        }
        for (int i = 0; i < 26; i++) {
            while (scanners[i].hasNextLine()){
                pw.println(scanners[i].nextLine());
            }
        }
        pw.close();
    }
}

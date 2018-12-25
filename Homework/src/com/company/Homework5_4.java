package com.company;

import java.util.Scanner;

public class Homework5_4 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        String s = scc.next();
        System.out.println("Keyword:");
        String ans = scc.next();
        char[] schr = s.toCharArray();
        if (ans.equals("u")){
            for (int i = 0; i<s.length(); i++){
                if (schr[i]>= 97 & schr[i]<=122) {
                    schr[i] = (char) (schr[i] - 32);
                    System.out.println("u");
                }
            }
        }else{
            for (int i = 0; i<s.length(); i++){
                if (schr[i]>= 65 & schr[i]<=90){
                    schr[i] = (char)(schr[i] + 32);
                    System.out.println('l');
                }
            }
        }
        System.out.println(schr);
    }
}

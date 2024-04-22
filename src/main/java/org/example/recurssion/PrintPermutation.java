package org.example.recurssion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str, "");
    }

    public static void printPermutation(String input, String ans){
        if(input.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String leftPart = input.substring(0, i);
            String rightPart = input.substring(i+1);
            String remInput =  leftPart + rightPart;
            printPermutation(remInput, ans + ch);
        }
    }
}

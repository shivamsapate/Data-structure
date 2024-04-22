package org.example.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        getSubSequence(input, "");

    }

    public static void getSubSequence(String input, String ans) {
        if(input.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = input.charAt(0);
        String remString = input.substring(1);

       getSubSequence(remString, ans+"");
       getSubSequence(remString, ans+ch);
    }
}

package org.example.recurssion;

import java.util.Scanner;

public class PrintDescAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        PrintDescAsc obj = new PrintDescAsc();
        obj.pdi(5);
    }

    //print increasing and decreasing values
    public void pdi(int n) {
        if(n == 0){
            return;
        }

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}

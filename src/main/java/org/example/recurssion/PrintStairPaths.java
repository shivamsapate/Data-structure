package org.example.recurssion;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String paths  = "";
        printStairPaths(n, paths);
    }

    // printing all possible ways to come to bottom
    public static void printStairPaths(int n, String paths) {
        if(n == 0) {
            System.out.println(paths);
            return;
        } else if(n < 0) {
            return;
        }

        printStairPaths(n-1, 1 + paths);
        printStairPaths(n-2, 2 + paths);
        printStairPaths(n-3, 3 + paths);

    }
}

package org.example.recurssion;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, n, m, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans){
        if(sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }

        if (sr < dr)
            printMazePaths(sr + 1, sc, dr, dc, "h"+ ans);

        if(sc < dc)
            printMazePaths(sr , sc + 1, dr, dc, "v"+ ans);

    }
}

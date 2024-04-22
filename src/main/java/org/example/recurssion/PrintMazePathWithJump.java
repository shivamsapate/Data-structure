package org.example.recurssion;

import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePathWithJump(1, 1, n, m, "");
    }

    public static void printMazePathWithJump(int sr, int sc, int dr, int dc, String ans) {
        if(sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }

        for(int hm = 1; hm <= dr - sr; hm++) {
            printMazePathWithJump(sr+hm, sc, dr, dc, "h"+hm+ans);
        }

        for(int vm = 1; vm <= dc - sc; vm++) {
            printMazePathWithJump(sr, sc+vm, dr, dc, "v"+vm+ans);
        }

        for(int dm = 1; dm <= dr - sr && dm <= dc - sc; dm++) {
            printMazePathWithJump(sr+dm, sc + dm, dr, dc, "d"+dm+ans);
        }
    }
}

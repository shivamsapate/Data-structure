package org.example.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> paths = findMazePath(1, 1, n, m);
        System.out.println(paths);
    }

    public static List<String> findMazePath(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        List<String> vPaths = new ArrayList<>();
        List<String> hPaths = new ArrayList<>();

        if(sr < dr)
            vPaths = findMazePath(sr + 1, sc, dr, dc);

        if(sc < dc)
            hPaths = findMazePath(sr , sc + 1, dr, dc);

        List<String> result = new ArrayList<>();

        for(String vPath : vPaths)
            result.add("v" + vPath);

        for(String hPath : hPaths)
            result.add("h" + hPath);

        return result;
    }
}

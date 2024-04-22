package org.example.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * sr = source row
 * sc = source column
 * dr = destination row
 * dc = destination column
 *
 * hm = horizontal move
 * vm = vertical move
 *
 */
public class MazePathWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> res = mazePathWithJump(1,1, n, m);
        System.out.println(res);
    }

    public static List<String> mazePathWithJump(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        List<String> result = new ArrayList<>();

        //horizontal moves
        for(int hm=1; hm <= dr-sr; hm++) {
            List<String> hPaths = mazePathWithJump(sr + hm, sc, dr, dc);
            for (String hpath : hPaths) {
                result.add("h"+ hm + hpath);
            }
        }

        //vertical moves
        for(int vm=1; vm <= dc-sc; vm++) {
            List<String> vPaths = mazePathWithJump(sr, sc + vm, dr, dc);
            for(String vpath : vPaths) {
                result.add("v" + vm + vpath);
            }
        }

//        for diagonal moves
        for(int dm = 1 ; dm <= dc-sc && dm <= dr - sr ; dm++) {
            List<String> dPaths = mazePathWithJump(sr + dm, sc + dm, dr, dc);
            for(String dpath : dPaths) {
                result.add("d" + dm + dpath);
            }
        }

        return result;
    }
}

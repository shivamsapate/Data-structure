package org.example.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyPress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNum = sc.next();
        List<String> result= getKeypress(inputNum);
        System.out.println(result);
    }

    static String[] codes = {".,", "abc","def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static List<String> getKeypress(String inputNum) {
        if(inputNum.isEmpty()) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        //678
        char first = inputNum.charAt(0); //6
        String remaining = inputNum.substring(1); //78

        List<String> recurResult = getKeypress(remaining);
        List<String> myResult = new ArrayList<>();

        for(char firstCodeVal : codes[Integer.parseInt(first+"")].toCharArray()) {
            for(String recurVal : recurResult) {
                myResult.add(firstCodeVal + recurVal);
            }
        }

        return myResult;
    }
}

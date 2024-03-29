package org.example.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepsToReach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strings = stepReach(n);
        System.out.println(strings);

    }

    public static List<String> stepReach(int n) {
        if(n == 0){
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        } else if (n < 0){
            return new ArrayList<>();
        }

        List<String> oneResult = stepReach(n - 1);//""
        List<String> twoResult = stepReach(n - 2);//""
        List<String> threeResult = stepReach(n - 3);//""

        List<String> result = new ArrayList<>();
        for(String one : oneResult)
            result.add(1+one);

        for(String two : twoResult)
            result.add(2+two);

        for(String three : threeResult)
            result.add(3+three);

        return  result;
    }
}

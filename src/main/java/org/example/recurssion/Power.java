package org.example.recurssion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerLinear(x, n));
        System.out.println(powerLogarithm(x, n));
    }

    //calculate a power of x^n
    public static int powerLinear(int x , int n) {
        if(n == 1) {
            return  x;
        }
        return x * powerLinear(x, n -1);
    }

    public static int powerLogarithm(int x, int n) {
        if(n==1){
            return  x;
        }

        if(n % 2 == 0) {
            return powerLogarithm(x, n/2) * powerLogarithm(x, n/2);
        } else {
            return x * powerLogarithm(x, n/2) * powerLogarithm(x, n/2);
        }

    }
}

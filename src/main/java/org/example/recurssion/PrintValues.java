package org.example.recurssion;

public class PrintValues {
    public static void main(String[] args) {
        PrintValues obj = new PrintValues();
        obj.printIncValues(5);
    }

    public void printDecValues(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecValues(n - 1);
    }

    public void printIncValues(int n) {
        if(n == 0){
            return;
        }
        printIncValues(n-1);
        System.out.println(n);
    }

}

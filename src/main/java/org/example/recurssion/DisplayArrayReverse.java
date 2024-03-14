package org.example.recurssion;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        displayReverse(arr, 0);
    }
    public static void displayReverse(int[] arr, int idx) {
        if(idx==arr.length)
            return;
        displayReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

package org.example.recurssion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx) {
        if(idx == arr.length)
            return 0;

        int max = maxOfArray(arr, idx + 1);

        return Math.max(max, arr[idx]);
    }
}

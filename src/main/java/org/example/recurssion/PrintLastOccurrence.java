package org.example.recurssion;

public class PrintLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,4 , 6, 7, 6, 4};
        int res = printFirstIdx(arr, 0, 6);
        System.out.println(res);
    }
    public static int printFirstIdx(int arr[], int idx, int element) {
        if(idx == arr.length)
            return -1;
        int res = printFirstIdx(arr, idx+1, element);
        if (arr[idx] == element) {
            return Math.max(res, idx);
        }
        return res;
    }
}

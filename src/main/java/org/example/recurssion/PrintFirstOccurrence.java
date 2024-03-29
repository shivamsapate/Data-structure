package org.example.recurssion;

public class PrintFirstOccurrence {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5 ,6 ,5};
        int res = printFirstIdx(arr, 0, 5);
        System.out.println("The index of element is " + res);
    }
    public static int printFirstIdx(int arr[], int idx, int element) {
        if (arr[idx] == element) {
            return idx;
        }
        return printFirstIdx(arr, idx+1, element);
    }
}

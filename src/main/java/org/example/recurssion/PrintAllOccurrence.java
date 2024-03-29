package org.example.recurssion;

public class PrintAllOccurrence {
    public static void main(String[] args) {

    }

    public static int[] allIndices(int arr[], int ele, int idx, int fsf) {

        if(idx == arr.length) {
            return new int[fsf];
        }
        if(arr[idx] == ele) {
            fsf+=1;
        }
        int[] res = allIndices(arr, ele, idx + 1, fsf);
        res[fsf] = idx;
        return res;
    }
}

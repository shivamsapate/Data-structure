package org.example.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        //logic --> pop less element --> add peek to res --> push to stack
        st.push(arr[n - 1]);
        result[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}

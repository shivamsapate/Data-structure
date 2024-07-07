package org.example.stack;

/*Input: N = 7, price[] = [100 80 60 70 60 75 85]
Output: 1 1 1 2 1 4 6
Explanation: Traversing the given input span for 100 will be 1,
80 is smaller than 100 so the span is 1,
60 is smaller than 80 so the span is 1,
70 is greater than 60 so the span is 2 and so on.
Hence the output will be 1 1 1 2 1 4 6.

Input: N = 6, price[] = [10 4 5 90 120 80]
Output:1 1 2 4 5 1
Explanation: Traversing the given input span for 10 will be 1, 4 is smaller than 10 so the span will be 1, 5 is greater than 4 so the span will be 2 and so on. Hence, the output will be 1 1 2 4 5 1.*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] span = stockSpan(arr);
        System.out.println(Arrays.toString(span));
    }



    public static int[] stockSpan(int... arr){
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for(int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
 }

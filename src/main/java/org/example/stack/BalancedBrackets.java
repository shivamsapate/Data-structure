package org.example.stack;

import java.util.Scanner;
import java.util.Stack;

//checking balanced brackets - each opening has closing brackets

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(ch=='(' || ch=='{' || ch=='[') {
                st.push(ch);
            } else {
                if(ch==')' && st.peek() == '(') {
                    st.pop();
                } else if(ch=='}' && st.peek() == '{') {
                    st.pop();
                } else if (ch==']' && st.peek() == '[') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }
        if(!st.isEmpty()) {
            System.out.println(false);
            return;
        }

        System.out.println(true);
    }
}

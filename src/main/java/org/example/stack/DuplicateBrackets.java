package org.example.stack;

import java.util.Scanner;
import java.util.Stack;


// ((a+b) + (c+d)) --> false
// (a+b) + ((c+d)) --> true (contains duplicate brackets)

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(checkDuplicateBrackets(input));
    }

    public static boolean checkDuplicateBrackets(String input) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ')'){
                if(st.peek() == '('){
                    return true;
                } else {
                    while (st.peek()!= '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}

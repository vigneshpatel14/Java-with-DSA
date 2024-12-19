package Stacks;

import java.util.Stack;

public class STL {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(11);
        st.pop();
        System.out.println(st.peek());
        st.push(1000);
        System.out.println(st);
    }
}

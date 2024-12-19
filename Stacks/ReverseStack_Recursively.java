package Stacks;

import java.util.Stack;

public class ReverseStack_Recursively {
    public static void PushAtBottom(Stack<Integer> st , int x)
    {
        if(st.size() == 0)
        {
            st.push(x);
            return;
        }

        int top = st.pop();
        PushAtBottom(st , x);
        st.push(top);
    }

    public static Stack<Integer> reverse(Stack<Integer> st)
    {
        if(st.size()==1)
        {
            return st;
        }
        int top = st.pop();
        reverse(st);
        PushAtBottom(st,top);
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(reverse(st));
    }
}

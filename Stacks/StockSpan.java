package Stacks;

import java.util.Stack;

public class StockSpan {
//    public static int[] sspan(int[] price)
//    {
//        int n = price.length;
//        Stack<Integer> st = new Stack<>();
//        st.push(0); //We will push only indexes
//        int[] ans = new int[n];
//        ans[0] = 1;
//        for(int i =1 ; i<n ;i++)
//        {
//            while(!st.isEmpty() && price[st.peek()] <= price[i])
//            {
//                st.pop();
//            }
//
//            ans[i] = (st.isEmpty())? (i+1):(i - st.peek());
//            st.push(i);
//        }
//        return ans;
//
//    }
//    public static void main(String[] args) {
//        int price[] = { 10, 4, 5, 90, 120, 80 };
//        int[] ans = sspan(price);
//        for(int i:ans) {
//            System.out.print(i + " ");
//        }
//    }





    public static int[] sspan(int[] price)
    {
        int n = price.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for( int i = n-1;i>=0;i--)
        {
            while(!st.isEmpty() && price[st.peek()] <= price[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return  ans;

    }
    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int[] ans = sspan(price);
        for(int i:ans) {
            System.out.print(i + " ");
        }
    }
}

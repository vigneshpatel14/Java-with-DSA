package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Copy_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        for( int i = 0 ;i<n;i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty())
        {
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while(!rt.isEmpty())
        {
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}

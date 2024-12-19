package Stacks;

import java.util.Stack;

public class PostFix_Evaluaton {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for( int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <=57)
            {
                val.push(ascii - 48);
            }
            else {
                int v2 = val.pop();
                int v1 = val.pop();

                switch(ch)
                {
                    case '+' :
                        val.push(v1+v2);
                        break;

                    case '-' :
                        val.push(v1-v2);
                        break;

                    case '*' :
                        val.push(v1*v2);
                        break;

                    case '/' :
                        val.push(v1/v2);
                        break;
                }
            }
        }
        System.out.println(val.peek());
    }
}

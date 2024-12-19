package Stacks;

import java.util.Stack;

public class Infix_Evaluation {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "9-(5+3)*4/6";
        for( int i = 0 ;i< str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch; //10 above unte kinda unna condition fail avuatdi
            if(ascii >= 48 && ascii <= 57)
            {
                val.push(ascii - 48);
            } else if (op.size()== 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                //Work
                while(op.peek() != '(')
                {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);

                    op.pop();

                }

                op.pop(); //To remove '('

            }

            else {
                if(ch == '+' || ch == '-')
                {

                    //Work
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);

                    op.pop();

                    op.push(ch);
                }

                if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        //Work
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if(op.peek() == '*') val.push(v1 * v2);
                        if(op.peek() == '/') val.push(v1 / v2);

                        op.pop();

                        //push
                        op.push(ch);
                    }
                    else {
                        op.push(ch);
                    }
                }
            }
        }

        while(val.size() > 1)
        {
            int v2 = val.pop();
            int v1 = val.pop();

            if(op.peek() == '-') val.push(v1 - v2);
            if(op.peek() == '+') val.push(v1 + v2);
            if(op.peek() == '*') val.push(v1 * v2);
            if(op.peek() == '/') val.push(v1 / v2);

            op.pop();
        }

        System.out.println(val.peek());
    }

}

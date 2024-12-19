package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        for( int i = 0 ;i< infix.length();i++)
        {
            char ch = infix.charAt(i);
            int ascii = (int)ch; //10 above unte kinda unna condition fail avuatdi
            if(ascii >= 48 && ascii <= 57)
            {
                //0 nundi 9 madyalo undi
                String s = "" + ch;
                val.push(s);
            } else if (op.size()== 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                //Work
                while(op.peek() != '(')
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();

                    String t = v1 + v2 + o;
                    val.push(t);
                }

                op.pop(); //To remove '('

            }

            else {
                if(ch == '+' || ch == '-')
                {

                    //Work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();

                    String t = v1 + v2 + o;
                    val.push(t);

                    op.push(ch);
                }

                if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        //Work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();

                        String t = v1 + v2 + o;
                        val.push(t);

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
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();

            String t = v1 + v2 + o;
            val.push(t);
        }

        System.out.println(val.peek());
    }
}

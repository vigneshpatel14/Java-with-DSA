package Stacks;

import java.util.Stack;

public class Basic_Calculator {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "17-(5+3)*4/16";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }

                i--; //Malli back ki povali ga if adhi operator kakapothe

                val.push(num);

            } else if (ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    val.push(applyoperation(op.pop(), val.pop(), val.pop()));
                }

                op.pop();
            } else if (isoperator(ch)) {

                while (op.size() != 0 && presendence(ch) <= presendence(op.peek())) {
                    val.push(applyoperation(op.pop(), val.pop(), val.pop()));
                }

                op.push(ch);
            }
        }

        while (op.size() > 0) {
            val.push(applyoperation(op.pop(), val.pop(), val.pop()));
        }

        System.out.println(val.peek());
    }


    public static int presendence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            default:
                return -1; //Invalid operator
        }
    }

    private static boolean isoperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int applyoperation(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}

package main.java.shubham.Stack;

import java.util.Stack;
/*
An expression is called the postfix expression if the operator appears in the expression after the operands.

Example :
Infix expression: A + B  *  C – D

Postfix expression:  A B + C D – *

    2 3 1 * + 9 –  => -4

Given a postfix expression, the task is to evaluate the expression. The answer could be very large, output your answer modulo (10^9+7). Also, use modular division when required.
*/

public class PostfixExpression {
    public static void main(String[] args) {
        // input
//        String exp = "231*+9-";
//        String exp = "123+*8–";
        String exp = "100200+2/5*7+";

        int ans = CalcPostfix(exp);
        System.out.println(ans);
    }

    private static int CalcPostfix(String exp) {
        int length = exp.length();

        // using stack collection
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while(i < length) {
            char c = exp.charAt(i);


            try{
                // if number, push in stack
                int n = Integer.parseInt(String.valueOf(c));
                stack.push(n);
            }catch (Exception e) {

                // if operator then
                int num2 = stack.pop();
                int num1 = stack.pop();

                switch (c){
                    case '+': stack.push(num1+num2);
                    break;
                    case '-': stack.push(num1-num2);
                    break;
                    case '*': stack.push(num1*num2);
                    break;
                    case '/': stack.push(num1/num2);
                    break;
                }
            }

            i++;
        }

        return stack.peek();
    }
}

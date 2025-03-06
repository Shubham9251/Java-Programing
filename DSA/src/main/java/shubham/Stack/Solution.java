package main.java.shubham.Stack;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Stack;
public class Solution {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

//        System.out.println(stack);  // it will give EmptyStackException
//        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println();

        stack.push('a');
        stack.push('b');
        System.out.println(stack);
        System.out.println(stack.get(1));
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println();
        System.out.println();
        System.out.println();

        Stack<Object> stack1 = new Stack<>();

        stack1.push('a');
        stack1.push('b');
        System.out.println(stack1);
        System.out.println(stack1.get(1));
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
        System.out.println(stack1);

        System.out.println();
        System.out.println();
        System.out.println();

        StringBuilder s = new StringBuilder("abcabccdcdef");
        s.reverse();
        System.out.println(s);
        s.append("z");
        s.append(s);
        System.out.println(s);

        if ('c' >= 'a') {
            System.out.println("yes");
        }

    }
}

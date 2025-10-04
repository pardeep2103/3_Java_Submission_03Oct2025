package Pratice;

//Q2: Stack of Strings
//Push strings and display top using peek().

import java.util.Stack;

public class Q69_Stick3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("After pop: " + stack);
    }
}


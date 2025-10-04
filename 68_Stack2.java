package Pratice;

import java.util.Stack;


//Q1: Reverse a Stack
//Push elements into a stack and pop them to print in reverse order.
public class Q68_Stack2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');

        System.out.println("Original Stack: " + stack);

        System.out.print("Reversed Order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

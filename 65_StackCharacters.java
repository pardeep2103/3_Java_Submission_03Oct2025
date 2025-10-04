package Pratice;

//Q4: Stack of Characters — Check Top and Pop All
//Problem: Push characters 'X', 'Y', 'Z', then use peek() and pop() to show how stack behaves.
import java.util.Stack;

public class Q64_StackCharacters {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        stack.push('X');
        stack.push('Y');
        stack.push('Z');

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements one by one
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

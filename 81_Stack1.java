package ArrayList;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // Create a Stack of characters
        Stack<Character> letters = new Stack<>();

       
        letters.push('A');
        letters.push('B');
        letters.push('C');
        System.out.println("Stack: " + letters);

   
        System.out.println("Top element: " + letters.peek());

        
        letters.pop();
        System.out.println("After pop: " + letters);

       
        letters.push('D');
        System.out.println("After pushing 'D': " + letters);
    }
}

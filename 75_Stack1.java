package Demo;

import java.util.Stack;

public class Q64_Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<Integer> stack1 = new Stack<Integer>();
  stack1.push(10);
  stack1.push(20);
  stack1.push(30);
  stack1.push(40);
  System.out.println("Stack: " + stack1);
  
  System.out.println("Top element (peek): " + stack1.peek());
  System.out.println("Popped element: " + stack1.pop());
  System.out.println("Stack after pop:  " + stack1);
  System.out.println("Popped element: " + stack1.pop());
  System.out.println("Stack after pop:  " + stack1);
  System.out.println("Popped element: " + stack1.pop());
  System.out.println("Stack after pop:  " + stack1);

  
	}

}

package Demo;

import java.util.Vector;

public class Q65_Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector<String> vector = new Vector<String>();

     vector.add("Java");
     vector.add("Python");
     vector.add("C++");
     
     
     System.out.println("Vector Elements: " + vector);
     System.out.println("vector.get(0) : " + vector.get(0));
     //Access elements
     System.out.println("First Elements: " + vector.firstElement());
     System.out.println("Last Elements: " + vector.lastElement());


     
     
	}

}

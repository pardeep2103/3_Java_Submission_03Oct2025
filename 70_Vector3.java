package Pratice;

import java.util.Vector;

public class Q71_Vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Vector<String> vector = new Vector<String>();
	     vector.add("12");
	     vector.add("2132");
	     vector.add("3412");
	     
	     
	     System.out.println("Vector Elements: " + vector);
	     System.out.println("vector.get(2) : " + vector.get(2));
	     //Access elements
	     System.out.println("First Elements: " + vector.firstElement());
	     System.out.println("Last Elements: " + vector.lastElement());

	}

}

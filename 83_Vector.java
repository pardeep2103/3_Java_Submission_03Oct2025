package ArrayList;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Create a Vector of numbers
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Numbers: " + numbers);

        numbers.add(40);
        System.out.println("After adding 40: " + numbers);

        numbers.set(1, 25); 
        System.out.println("After setting index 1 to 25: " + numbers);

        numbers.remove(0);
        System.out.println("After removing first element: " + numbers);
    }
}

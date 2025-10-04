package ArrayList;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> a1 = new ArrayList<String>();

        // Add elements
        a1.add("Pune");
        a1.add("Panjab");
        a1.add("Haryana");

        // Print the whole ArrayList
        System.out.println(a1);

        // Print each element using for-each loop
        for (String s : a1) {
            System.out.println(s);
        }

        // Remove the first element (index 0)
        a1.remove(0);

        // Print after removing
        System.out.println("After removing: " + a1);
    }
}

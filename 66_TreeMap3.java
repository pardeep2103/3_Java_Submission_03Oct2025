package Pratice;

import java.util.TreeMap;

public class Q66_TreeMap3 {

    public static void main(String[] args) {
        // Create a TreeMap (Keys will be stored in ascending order)
        TreeMap<String, Long> phoneDirectory = new TreeMap<String, Long>();
        
        // Adding entries
        phoneDirectory.put("Charlie", 9876543210L);
        phoneDirectory.put("Alice", 9973443430L);
        phoneDirectory.put("Bob", 9734543320L);
        phoneDirectory.put("Diana", 9123456789L);
        
        // Access a value using key
        System.out.println("Alice's number: " + phoneDirectory.get("Alice"));
        
        // Iterate through TreeMap (sorted order of keys)
        System.out.println("\nPhone Directory (Sorted by Name):");
        for (String name : phoneDirectory.keySet()) {
            System.out.println(name + " : " + phoneDirectory.get(name));
        }
        
        // Special navigation methods
        System.out.println("\nFirst key: " + phoneDirectory.firstKey());
        System.out.println("Last key: " + phoneDirectory.lastKey());
        
        // Check if key exists
        System.out.println("\nContains 'Bob'? " + phoneDirectory.containsKey("Bob"));
        
        // Get size
        System.out.println("Total contacts: " + phoneDirectory.size());
    }
}
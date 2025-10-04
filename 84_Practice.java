package Pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class Q84_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        
        System.out.println("=== Simple Item Manager ===");
        
        // Add items
        System.out.print("Enter number of items to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String item = sc.nextLine();
            items.add(item);
        }
        
        // Display all items
        System.out.println("\nAll Items:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
        
        // Check if list contains an item
        System.out.print("\nEnter item to search: ");
        String searchItem = sc.nextLine();
        if (items.contains(searchItem)) {
            System.out.println("Found: " + searchItem + " at position " + (items.indexOf(searchItem) + 1));
        } else {
            System.out.println("Item not found!");
        }
        
        // Remove an item
        System.out.print("\nEnter item number to remove: ");
        int removeIndex = sc.nextInt() - 1;
        
        if (removeIndex >= 0 && removeIndex < items.size()) {
            String removed = items.remove(removeIndex);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid position!");
        }
        
        // Display final list
        System.out.println("\nFinal Items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
        
        System.out.println("\nTotal items remaining: " + items.size());
        sc.close();
    }
}
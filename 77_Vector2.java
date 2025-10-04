package Demo;

import java.util.TreeMap;

public class Q66_treemap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a TreeMap (Keys will be stored in ascending order)
TreeMap<String, Integer> phoneDirectory = new TreeMap<String, Integer>();
 //Adding entries
phoneDirectory.put("Charle", 987654321);
phoneDirectory.put("Alice", 997344343);
phoneDirectory.put("Charle", 973454332);

//PhoneDirectory.put(null, 111222333);

//Access a value using key
System.out.println("Alice's number: " + phoneDirectory.get("Alice"));

//Iterate through TreeMap (sorted order of keys)
System.out.println("\nPhone Directory (Sorted):");
for (String name : phoneDirectory.keySet()) {
	System.out.println(name + " " + phoneDirectory.get(name));
}

//Special navigation methods
System.out.println("\nFirst key: " + phoneDirectory.firstKey());
System.out.println("Last key: " + phoneDirectory.lastKey());

}
	}



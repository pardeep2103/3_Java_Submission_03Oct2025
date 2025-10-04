package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice"); 
        System.out.println("Students: " + students);

        students.remove("Bob");
        System.out.println("After removing Bob: " + students);

        System.out.println("Contains Charlie? " + students.contains("Charlie"));
    }
}

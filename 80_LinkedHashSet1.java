package ArrayList;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);

        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits);

        System.out.println("Is the fruit set empty? " + fruits.isEmpty());
    }
}

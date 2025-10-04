package ArrayList;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // Q: Store high scores in ascending order
        Set<Integer> scores = new TreeSet<>();

        scores.add(75);
        scores.add(90);
        scores.add(50);
        scores.add(85);
        System.out.println("Leaderboard (sorted): " + scores);

        // Remove a score
        scores.remove(50);
        System.out.println("After removing 50: " + scores);

        // Check highest score
        System.out.println("Highest score: " + ((TreeSet<Integer>) scores).last());
    }
}

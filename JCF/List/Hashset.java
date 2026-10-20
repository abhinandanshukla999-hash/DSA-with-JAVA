package JCF.List;

import java.util.Set;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        // Add elements
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(10); // Duplicates are not allowed

        System.out.println("Set: " + s);//insertion order doesn't follows

        // Check whether an element exists
        System.out.println("Contains 20: " + s.contains(20));

        // Remove an element
        s.remove(30);

        System.out.println("Set after removal: " + s);
        System.out.println("Size: " + s.size());
    }
}

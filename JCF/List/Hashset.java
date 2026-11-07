package JCF.List;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);

        System.out.println("HashSet: " + set);

        System.out.println("Contains 20: " + set.contains(20));

        set.remove(30);

        System.out.println("After removal: " + set);

        System.out.println("Size: " + set.size());

        System.out.println("Is Empty: " + set.isEmpty());

        System.out.println("Iterating HashSet:");

        for (int num : set) {
            System.out.println(num);
        }

        System.out.println("Using Iterator:");

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        set.addAll(Arrays.asList(50, 60, 70));

        System.out.println("After addAll: " + set);

        set.removeAll(Arrays.asList(10, 20));

        System.out.println("After removeAll: " + set);

        set.retainAll(Arrays.asList(40, 50, 60));

        System.out.println("After retainAll: " + set);

        set.clear();

        System.out.println("After clear: " + set);
    }
}

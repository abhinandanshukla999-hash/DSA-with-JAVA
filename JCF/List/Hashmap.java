package JCF.List;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "Ram");
        m.put(2, "Abhi");
        m.put(3, "Shyam");
        m.put(4, "Abhi");

        System.out.println(m);// a dictionary of all the elements

        for (Map.Entry<Integer, String> map : m.entrySet()) {
            System.out.print(map.getKey() + ": ");
            System.out.print(map.getValue() + " \n");
        }

        System.out.println(m.get(1));//returns the value of key 1
        System.out.println(m.containsKey("Abhinandan"));//false

        System.out.println(m.isEmpty());//false

    }
}

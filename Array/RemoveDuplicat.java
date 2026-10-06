import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicat {
     public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 4 };
        System.out.println("Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            map.getOrDefault(arr[i], map.put(arr[i], 0) + 1);
        }
        for (int i = 0; i < map.size(); i++) {
            int x = map.get(i);
            System.out.print(x);
        }
    }
}


import java.util.Arrays;

public class AddOne {
    public static void main(String[] args) {
        int arr[] = {9, 9, 9};

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
            }
        }

        
        if (arr[0] == 0) {
            arr = new int[arr.length + 1];
            arr[0] = 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}

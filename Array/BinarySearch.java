
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    static int searchEle(int arr[], int target) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int len = sc.nextInt();

        // checking for the negative size of array
        if (len < 0) {
            System.out.println("Array length cannot be negative.");
            sc.close();
            return;
        }

        int arr[] = new int[len];

        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search:");
        int target = sc.nextInt();

        int ele = searchEle(arr, target);

        if (ele == -1) {
            System.out.println("Element is not present in the array!");
        } else {
            System.out.println("Element found at index: " + ele);
        }

        sc.close();
    }
}

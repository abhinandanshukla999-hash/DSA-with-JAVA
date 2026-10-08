import java.util.Scanner;

public class BinarySearch {
    static void searchEle(int arr[], int target) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int mid = first + (last - first) / 2;
            if (target == arr[mid]) {
                System.out.println("Found at index:" + mid);
                break;

            } else if (target < arr[mid])
                last = mid - 1;

            else if (target > arr[mid])
                first = mid + 1;
            else
                System.out.println("Value is not present in the array!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array;");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int target = sc.nextInt();
        searchEle(arr, target);

    }
}

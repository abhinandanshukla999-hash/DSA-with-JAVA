import java.util.Scanner;

public class JumpSearch {

    static int jumpSearch(int[] arr, int target) {

        int n = arr.length;

        // Step 1: Calculate jump size
        int step = (int) Math.sqrt(n);

        int prev = 0;

        // Step 2: Find the block where target may exist
        while (arr[Math.min(step, n) - 1] < target) {

            prev = step;
            step = step + (int) Math.sqrt(n);

            // Target is not present
            if (prev >= n) {
                return -1;
            }
        }

        // Step 3: Linear search inside the block
        while (arr[prev] < target) {

            prev++;

            // Reached the end of the block
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // Step 4: Checking whether the target is found
        if (arr[prev] == target) {
            return prev;
        }

        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = jumpSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
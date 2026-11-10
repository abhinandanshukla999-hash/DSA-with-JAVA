
import java.util.*;

public class CSum {

    public static void main(String[] args) {

        // Step 1: Initialize the array
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Step 2: Create an object of Main
        CSum obj = new CSum();

        // Step 3: Call the threeSum method
        List<List<Integer>> result = obj.threeSum(nums);

        // Step 4: Print the result
        System.out.println("Unique Triplets:");

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        // Store all valid triplets in a 2D array
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        // Fix the first element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize two pointers
            int left = i + 1;
            int right = nums.length - 1;

            // Search for the remaining two elements
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Case 1: Found a valid triplet
                if (sum == 0) {

                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left elements
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right elements
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                // Case 2: Sum is smaller than zero
                else if (sum < 0) {
                    left++;
                }

                // Case 3: Sum is greater than zero
                else {
                    right--;
                }
            }
        }

        return result;
    }
}

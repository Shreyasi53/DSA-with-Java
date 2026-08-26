package SlidingWindow;

import java.util.*;

public class subarrSum {

    // Function 1: Take input
    static int[] inputArray(Scanner sc) {
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        return nums;
    }

    // Function 2: Find maximum sum
    static int maxSubarraySum(int[] nums, int k) {
        int low = 0;
        int high = k - 1;
        int sum = 0;

        // Sum of first window
        for (int i = low; i <= high; i++) {
            sum = sum + nums[i];
        }

        int res = sum;

        // Sliding window
        while (high < nums.length - 1) {
            low++;
            high++;

            sum = sum - nums[low - 1];
            sum = sum + nums[high];

            res = Math.max(res, sum);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = inputArray(sc);

        System.out.println("Enter the size of the subarray k:");
        int k = sc.nextInt();

        int result = maxSubarraySum(nums, k);

        System.out.println("Maximum sum = " + result);
    }
}
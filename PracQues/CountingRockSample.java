
package PracQues;
import java.util.*;

public class CountingRockSample {
    // Finds the first index where nums[index] >= target
    public static int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of samples
        int r = sc.nextInt(); // Number of ranges
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[][] ranges = new int[r][2];
        for (int i = 0; i < r; i++) {
            ranges[i][0] = sc.nextInt(); // Minimum
            ranges[i][1] = sc.nextInt(); // Maximum
        }
        // Sort the samples
        Arrays.sort(nums);
        int[] ans = new int[r];
        for (int i = 0; i < r; i++) {
            int min = ranges[i][0];
            int max = ranges[i][1];
            // First sample >= min
            int start = lowerBound(nums, min);
            // first sample > max
            int end = lowerBound(nums, max + 1);
            ans[i] = end - start;
        }

        // Print each range's count
        for (int i = 0; i < r; i++) {
            System.out.println(ans[i]);
        }
        sc.close();
    }
}

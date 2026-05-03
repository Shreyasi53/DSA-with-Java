package AtoZ.Array_mid;

import java.util.*;

public class nextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermu(nums);

        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }

    // Main logic
    public static void nextPermu(int[] nums) {
        int n = nums.length;

        // STEP 1: Find the "break point"
        // Traverse from right and find first index i such that nums[i] < nums[i+1]
        int ind1 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }

        // STEP 2: If no break point found
        // Array is in descending order → highest permutation
        // So reverse whole array to get smallest permutation
        if (ind1 == -1) {
            reverse(nums, 0);
            return;
        }

        // STEP 3: Find the next greater element from right side
        int ind2 = -1;
        for (int i = n - 1; i > ind1; i--) {
            if (nums[i] > nums[ind1]) {
                ind2 = i;
                break;
            }
        }

        // STEP 4: Swap both indices
        swap(nums, ind1, ind2);

        // STEP 5: Reverse the right part (ind1+1 → end)
        reverse(nums, ind1 + 1);
    }

    // Swap function
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse function (from start to end)
    public static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
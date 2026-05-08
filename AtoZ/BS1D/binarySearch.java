package AtoZ.BS1D;


import java.util.*;

public class binarySearch {
    public static int binarySearchItr(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1; // Search in right half
            else high = mid - 1;                        // Search in left half
        }
        return -1; // Target not found
    }
//    TC = O(log n)
//    SC = O(1)
    public static int binarySearchRec(int[] nums, int low, int high, int target) {
        if (low > high) return -1; // Base case: target not found
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        else if (target > nums[mid])
            return binarySearchRec(nums, mid + 1, high, target);
        return binarySearchRec(nums, low, mid - 1, target);
    }
    //TC = O(log n)
    //SC = O(log n)
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearchItr(a, target);
        int ind2 = binarySearchRec(a, 0, a.length-1,target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}



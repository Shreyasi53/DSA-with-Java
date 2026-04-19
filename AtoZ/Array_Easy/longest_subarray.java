package AtoZ.Array_Easy;
//Longest Subarray with given Sum K(Positives)
//
//Problem Statement: Given an array nums of size n and an integer k,
// find the length of the longest sub-array that sums to k.
// If no such sub-array exists, return 0.

//Input: nums = [10, 5, 2, 7, 1, 9], k = 15
// Output: 4

import java.util.*;
public class longest_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n = sc.nextInt();
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements:");
        for(int i = 0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxLen = 0;
        int left = 0;
        int sum = 0;

        // traverse through the array
        for(int right = 0; right < n; right++){

            // Expand the window to the right (add current element)
            sum += nums[right];

            // shrink the window if sum exceeds k
            while(left <= right && sum > k){
                sum = sum - nums[left];
                left++;
            }

            // Update max length if sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println(maxLen);
    }
}
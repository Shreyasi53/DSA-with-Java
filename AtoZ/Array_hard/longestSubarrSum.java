package AtoZ.Array_hard;
//PS: Given an array containing both positive and negative integers,
//we have to find the length of the longest subarr with the sum of all elements equal to zero.
//https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum
import java.util.*;

public class longestSubarrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //use prefix sum + hashmap
        int maxlen = 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum==0) {
                maxlen = i + 1;
            }
            else if(sumIndexMap.containsKey(sum)) {
                maxlen = Math.max(maxlen, i - sumIndexMap.get(sum));
            }
            else {
                sumIndexMap.put(sum, i);
            }

        }
        System.out.println(maxlen);
    }
}

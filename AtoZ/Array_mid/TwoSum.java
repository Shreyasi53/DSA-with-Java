package AtoZ.Array_mid;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                int[] ans = new int[]{map.get(complement), i};
                System.out.println(Arrays.toString(ans));
                return; // stop after finding answer
            }

            map.put(nums[i], i);
        }

        System.out.println("No solution found");
    }
}
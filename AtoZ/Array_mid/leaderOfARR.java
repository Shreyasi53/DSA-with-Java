package AtoZ.Array_mid;
//arr = [10, 22, 12, 3, 0, 6]
//Output: 22 12 6
//Explanation:
// 6 is a leader because there are no elements after it.
//12 is greater than all the elements to its right (3, 0, 6),
// and 22 is greater than 12, 3, 0, 6, making them leaders as well.

import java.util.*;
public class leaderOfARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int max = nums[n-1]; //last element of the array is always a leader
        ans.add(nums[n-1]);

        for(int i = n-2; i>=0; i--){
            if(nums[i]>max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);
        System.out.println("Leaders of the array is:"+ ans);
    }
}

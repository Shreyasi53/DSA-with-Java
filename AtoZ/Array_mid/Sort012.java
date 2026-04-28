package AtoZ.Array_mid;
//LC 75: Sort an array of 0s,1s and 2s
//Pattern: Dutch National flag

import java.util.*;
public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int low = 0, mid = 0;
        int high = nums.length - 1;

        while( mid <= high){
            if(nums[mid]==0){
                //place 0 to the left, swap(low, mid)
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                //keep in mid. skip
                mid++;
            }
            else{
                //place 2 to right. swap(mid, high)
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        System.out.print("The sorted array is:"+ Arrays.toString(nums));
    }
}

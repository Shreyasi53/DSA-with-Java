package AtoZ.Array_mid;
//Input: nums = [3,1,-2,-5,2,-4]
//Output: [3,-2,1,-5,2,-4]

import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for(int i = 0; i<n; i++){
            if(nums[i] >= 0){
                ans[pos] = nums[i];
                pos += 2;
            }else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        System.out.println("The positive and negative alternative array is:" + Arrays.toString(ans));
    }
}

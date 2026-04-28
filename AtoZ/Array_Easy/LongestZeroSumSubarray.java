package AtoZ.Array_Easy;


import java.util.*;
public class LongestZeroSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int maxLen = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += nums[i];

            //case 1: if sum becomes 0
            if(sum == 0){
                maxLen = i + 1;
            }
            //case 2: if sum seen before
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            }
            else{
                //store first occurence
                map.put(sum, i);
            }
        }
        System.out.println("Longest length: "+maxLen);
    }
}

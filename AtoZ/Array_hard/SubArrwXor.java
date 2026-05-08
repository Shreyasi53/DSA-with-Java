package AtoZ.Array_hard;
//Given an array and integer k,
//find total number of subarrays whose XOR = k

import java.util.*;

public class SubArrwXor {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;
        System.out.println(subarraysWithXorK(arr, k));
    }

    public static int subarraysWithXorK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // base case
        map.put(0, 1);
        int xr = 0;
        int count = 0;
        for(int num : arr){
            xr = xr ^ num;
            int x = xr ^ k;
            if(map.containsKey(x)){
                count += map.get(x);
            }
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return count;
    }
}
//TC: O(n)  SC:O(n)
package AtoZ.Array_hard;
//LC:15 ... 3sum(Given an array arr,find all unique triplets such that
// nums[i]+ nums[j]+nums[k] = 0 )

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //brute force ... TC:O(n3)
//        Arrays.sort(nums);
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i=0; i<n-2; i++){
//            for(int j=i+1; j<n-1; j++){
//                for(int k=j+1; k<n; k++){
//                    if(nums[i] +nums[j]+nums[k] == 0){
//                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//                        set.add(triplet);
//                    }
//                }
//            }
//        }
//        System.out.println(set);

        //better approach...TC:O(n2) SC: O(n)
//        Arrays.sort(nums);
//        Set<List<Integer>> set = new HashSet<>();
//        for(int i=0; i<n; i++){
//            Set<Integer> hash = new HashSet<>();
//            for(int j = i+1; j<n; j++){
//                int third = -(nums[i]+nums[j]);
//                if(hash.contains(third)){
//                    List<Integer> triplet = Arrays.asList(nums[i],nums[j], third);
//                    Collections.sort(triplet);
//                    set.add(triplet);
//                }
//                hash.add(nums[j]);
//            }
//        }
//        System.out.println(set);
        //Optimal solution... TC: O(n2) SC: O(1)
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            //skip duplicates
            if(i>0 && nums[i] == nums[i+1]) continue;

            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;//skip duplicate j
                    while(j<k && nums[k] == nums[k+1]) k--;//skip duplicate k
                }
            }
        }
        System.out.println(ans);
    }
}

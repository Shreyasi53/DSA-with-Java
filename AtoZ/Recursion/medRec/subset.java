package AtoZ.Recursion.medRec;
import java.util.*;
//LC: 78
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
public class subset {
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(0, nums, current, ans);
        return ans;
    }

    static void solve(int index, int[] nums, List<Integer> current, List<List<Integer>> ans){
        //base case
        if(index == nums.length){
            ans.add(new ArrayList<>(current));//Store a copy
            return;
        }
        //choice 1: take the current element
        current.add(nums[index]);
        solve(index+1, nums, current, ans);

        // Backtrack (Undo the choice)
        current.remove(current.size() - 1);

        // Choice 2: Don't take the current element
        solve(index + 1, nums, current, ans);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}

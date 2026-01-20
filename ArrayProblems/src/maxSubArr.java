//Print subarray with maximum subarray sum... print the subarray
//Kadane's algorithm
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//output: [4,-1,2,1]
public class maxSubArr {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(arr);
        System.out.println("Max Sum = " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currSum + nums[i]) {
                currSum = nums[i];
                tempStart = i; //potential new subarray start
            } else {
                currSum += nums[i];
            }
            // Update maxSum and best subarray indices
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        // Print the subarray
        System.out.print("Max Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return maxSum;
    }
}

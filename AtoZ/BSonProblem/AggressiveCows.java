//Problem Statement: You are given an array 'arr' of size 'n' which denotes the position of stalls. You are also given an integer 'k' which denotes the number of aggressive cows.
//You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible. Find the maximum possible minimum distance.
package AtoZ.BSonProblem;
import java.util.*;
public class AggressiveCows {
    // Function to check if cows can be placed
    public static boolean canWePlace(int[] arr, int dist, int cows) {
        int countCow = 1;
        // place first cow at first stall
        int last = arr[0];
        for(int i = 1; i < arr.length; i++) {
            // place next cow
            if(arr[i] - last >= dist) {
                countCow++;
                last = arr[i];
            }
            // all cows placed
            if(countCow >= cows) {
                return true;
            }
        }
        return false;
    }

    // Brute force solution
    public static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int n = arr.length;
        // maximum possible distance
        int limit = arr[n-1] - arr[0];
        // try every distance
        for(int dist = 1; dist <= limit; dist++) {
            // if not possible
            if(canWePlace(arr, dist, cows) == false) {
                // previous distance was answer
                return dist - 1;
            }
        }
        return limit;
    }

    //Binary search
    public static int agressiveCowsBS(int[] arr, int cows){
        Arrays.sort(arr);
        int n = arr.length;
        int low = 1, high = arr[n-1]-arr[0];
        int ans = 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canWePlace(arr, mid,cows)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stalls: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter stall positions:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of cows: ");
        int cows = sc.nextInt();
        int ans = aggressiveCows(arr, cows);
        System.out.println(
                "Maximum minimum distance: " + ans
        );
    }
}
package AtoZ.BSonProblem;

import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int n = sc.nextInt();
        System.out.println(floorSqrt(n));
    }
    //BRUTE FORCE approach TC: O(n) SC:O(1)
    public static int floorSqrt(int n){
        int ans = 0;
        for(int i =0; i<=n; i++){
            if((long)(i)*i<=n){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
    }
    //OPTIMAL SOLUTION TC:O(log n) using binary search
    public static int BSsqrt(int n){
        if (n < 2) return n;
        int left = 1, right = n/2, ans=0;
        while(left <= right){
            long mid = left + (right - left)/2;
            if(mid * mid <= n){
                ans = (int)mid;
                left = (int)mid + 1;
            }else{
                right = (int)mid-1;
            }
        }
        return ans;
    }
}

package AtoZ.BSonProblem;

import java.util.Scanner;

public class NthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power n:");
        int n = sc.nextInt();
        System.out.println("Enter the number m:");
        int m = sc.nextInt();
        int ans = Nthroot(n,m);
        System.out.println(ans);
    }
    public static int Nthroot(int n, int m){
        int low = 1, high = m;
        while(low <= high){
            int mid = low + (high - low)/2;
            long value = power(mid, n);
            //root found
            if(value == m) {
                return mid;
            }
            else if (value<n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static long power(int base, int exp){
        long ans = 1;
        for(int i = 1; i <= exp; i++){
            ans*=base;
        }
        return ans;
    }
}

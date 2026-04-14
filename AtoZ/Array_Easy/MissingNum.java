package AtoZ.Array_Easy;

import java.util.Scanner;

//Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//Output: 6
//Explanation: All the numbers from 1 to 8 are present except 6.

//1 + 2 + 3 + 4 + .......+ n = total sum
//Missing = Total Sum - Array Sum
public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (range 1 to n):");
        int n = sc.nextInt();

        int[] arr = new int[n-1]; //size n-1

        System.out.println("Enter " +(n-1)+ "elements:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        //calculate the sum of array elements
        int sum = 0;
        for(int i = 0; i<n-1; i++){
            sum+=arr[i];
        }
        long expSum = (long)n*(n+1)/2;
        int ans = (int)(expSum-sum);
        System.out.println("the missing number is :"+ans);
    }
}

package AtoZ.Array_Easy;

import java.util.Scanner;

//leetcode 1752
//Given an array nums, return true if the array was originally sorted in non-decreasing order,
// then rotated some number of positions (including zero). Otherwise, return false.
public class ArraySortedII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        if (count<=1){
            System.out.print("the given array is sorted");
        }
        else{
            System.out.println("unsorted array");
        }
    }
}

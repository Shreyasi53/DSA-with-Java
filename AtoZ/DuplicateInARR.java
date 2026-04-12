package AtoZ;

import java.util.Scanner;

//lc 26
//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
public class DuplicateInARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for(int j = 1; j<n; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        int ans = i+1;
        System.out.println(ans);

    }
}

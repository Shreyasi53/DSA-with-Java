package AtoZ.Array_Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be search");
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            if(arr[i]==k){
                System.out.println("element found at the index"+i);
                return;
            }
        }
        System.out.println("Element not found");
    }

}

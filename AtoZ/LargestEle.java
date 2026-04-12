//Given an array, we have to find the largest element in the array.

package AtoZ;

import java.util.Scanner;

public class LargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //find largest
        int largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element:"+largest);
    }
}

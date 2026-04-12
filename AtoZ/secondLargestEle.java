package AtoZ;

import java.util.Scanner;

public class secondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //second largest
        int max = arr[0];
        int secondMax = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println("second largest element is"+secondMax);
    }
}

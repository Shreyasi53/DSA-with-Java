package AtoZ;
//Given an integer array, rotate the array to the right by k steps,
import java.util.Arrays;
import java.util.Scanner;

public class rotateARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations you want:");
        int k = sc.nextInt();

        if(k>n) k = k%n;
        if(n == 0) return;
        //reverse the whole array,, reverse first k elements ,, reverse remaining(n-k)
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);


        System.out.println("array after rotation :"+ Arrays.toString(arr));

        //arr is an object, java prints its memory reference , not value
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


}

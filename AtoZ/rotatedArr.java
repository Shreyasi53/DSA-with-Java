package AtoZ;

import java.util.*;

//Left rotate array by one place
//INPUT: [1,2,3,4,5]
//output: [2,3,4,5,1]
//thinking: store 1st element, shift all elements left, put first at end..
public class rotatedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
        System.out.println("array after the rotation :"+ Arrays.toString(arr));

        //arr is an object, java prints its memory reference , not value
    }
}

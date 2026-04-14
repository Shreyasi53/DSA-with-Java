package AtoZ.Array_Easy;
//Given an integer array , move all 0's to the end
// of it while maintaining the relative order of the non-zero elements.
//Input:  [0,1,0,3,12] Output: [1,3,12,0,0]

//keep non-zero elements at the front ,, dont move 0 --> move nonzeros,,
//i=position for the next non-zero;
//j= traverse
//if nums[j]!=0 then swap with the i, i++
import java.util.*;

public class moveZeros {
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
        for(int j = 0; j<n; j++){
            if(arr[j]!=0){
                //swap with i
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        System.out.println("Array after moving zeros :"+Arrays.toString(arr));
    }
}

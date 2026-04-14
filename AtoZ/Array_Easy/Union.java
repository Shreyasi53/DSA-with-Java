package AtoZ.Array_Easy;
//Given two sorted arrays, arr1, and arr2 of size n and m.
// Find the union of two sorted arrays.
import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in 1st array:");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of element in second array:");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.print("Enter the elements:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> result = findUnion(arr1, arr2, n, m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");


    }
    public static List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        List<Integer> Union = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(Union.isEmpty()|| Union.get(Union.size()-1)!=arr1[i])
                    Union.add(arr1[i]);
                i++; //move pointer in arr1
            }
            else if(arr1[i]>arr2[j]){
                // Add if empty or not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;  // Move pointer in arr2
            }
            else {
                // Elements are equal, add once if not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;  // Move both pointers
            }
        }
        // Append remaining elements from arr1
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        // Append remaining elements from arr2
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}

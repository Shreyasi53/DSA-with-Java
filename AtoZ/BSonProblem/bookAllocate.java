package AtoZ.BSonProblem;
//Given an array ‘arr of integer numbers, ‘ar[i]’ represents the number of pages in the ‘i-th’ book. There are a ‘m’ number of students, and the task is to allocate all the books to the students.
//Allocate books in such a way that:
import java.util.*;

public class bookAllocate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter pages of each books:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of students:");
        int k = sc.nextInt();

        int ans = minPages(arr, k);
        System.out.println(
                "Maximum no of pages allocated is minimum" + ans
        );
    }

    public static int minPages(int[] arr, int k){
        int n = arr.length;
        if(k > n) return -1;
        int max = 0, sum = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int low = max, high = sum, res = -1;
        while(low <= high){
            int mid = low + ( high - low)/2;
            if(allocisPossible(arr, k, mid)){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }

    public static boolean allocisPossible(int[] arr, int k, int barrier){
        int allocatedStudent = 1, pages = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > barrier) return false;

            if(pages + arr[i] > barrier){
                allocatedStudent += 1;
                pages += arr[i];
            }

            else pages += arr[i];
        }
        if(allocatedStudent > k) return false;
        else return true;
    }
}

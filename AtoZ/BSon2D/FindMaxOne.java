package AtoZ.BSon2D;
//Find the row with maximum ones
import java.sql.SQLOutput;
import java.util.*;
public class FindMaxOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();

        System.out.print("Enter number of columns:");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter matrix:");
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = rowWithMax1s(arr, n, m);
        System.out.println("Row with maximum 1s:"+ans);
    }
    //Optimal solution   TC:(nlogm)
    public static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int rowWithMax1s(int[][] arr, int n, int m){
        int maxCount = 0;
        int index = -1;
        for(int i = 0; i < n; i++){
            int idx = lowerBound(arr[i], 1);
            int countOnes = m - idx;

            if(countOnes > maxCount){
                maxCount = countOnes;
                index = i;
            }
        }
        return index;
    }



    //Brute force TC: O(n*m)
    /*public static int rowWithMax1s(int[][] arr, int n, int m){
        int idx = -1;
        int maxCount = -1;
        //traverse every row
        for(int i = 0; i < n; i++){
            int countRow = 0;
            //count no of ones
            for(int j = 0; j < m; j++){
                countRow += arr[i][j];
            }
            //update max row
            if(countRow > maxCount){
                maxCount = countRow;
                idx = i;
            }
        }
        return idx;
    }*/
}

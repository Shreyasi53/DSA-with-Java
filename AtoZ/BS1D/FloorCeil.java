package AtoZ.BS1D;

import java.util.*;

public class FloorCeil {
    public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            // possible floor
            if(arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1; // search for bigger valid value
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            // possible ceil
            if(arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1; // search for smaller valid value
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target x: ");
        int x = sc.nextInt();
        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}
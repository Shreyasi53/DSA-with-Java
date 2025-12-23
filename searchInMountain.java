//leetcode question no-1095
// int[] arr={1,2,3,4,5,3,1}; target=3
//step-1 Find peek element => index 4
//step-2 binary search in the ascending array =>(0,4)
//step-3 if not found binary search in decresing array => (4,6)

public class searchInMountain {
    public static void main(String[] args) {
        int[] arr= {0,1,2,4,2,1};
        int target = 2;
        int ans= search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int peak = peekIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peekIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start<= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target< arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}

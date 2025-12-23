//we do not know the array is sorted in ascending or descending order that is called order agnostic
public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr= {99,80, 74, 67, 50, 47, 42,27, 18, -9, -29};
        int target = 18;
        int ans= orderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
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

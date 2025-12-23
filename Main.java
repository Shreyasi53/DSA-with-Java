public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -10, -9, 0, 3, 5,7,8,15, 18};
        int target = 1;
        int ans= floorNum(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){

        if(target > arr [arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid= start+ (end-start)/2;
            if(target< arr[mid]){
                end= mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
       return -1;
    }

    static int ceilingNum(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid= start + (end-start)/2;
            if(target< arr[mid]){
                end= mid-1;
            }
            else if(target> arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    static int floorNum(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid= start + (end-start)/2;
            if(target< arr[mid]){
                end= mid-1;
            }
            else if(target> arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}

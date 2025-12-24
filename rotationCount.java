//arr =[4,5,6,7,0,1,2] rotated 4 times ans=pivot+1
public class rotationCount {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot +1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start< end){
            int mid= start+ (end-start)/2;
            //4cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid] < arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start< end){
            int mid= start+ (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            //if elements at middle, start, end are equal then skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //whether ens is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start]< arr[mid] || (arr[start]== arr[mid] && arr[mid]> arr[end])){
                start = mid +1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
}

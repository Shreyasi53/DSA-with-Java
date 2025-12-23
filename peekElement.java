//peek element in a mountain array
//also known as bitonic array first increaseing then decreasing
public class peekElement {
    public static void main(String[] args) {
        int[] arr= {0, 1, 2, 3, 4, 7, 2, 1};
        int ans = peekIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peekIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of the array. this may be the answer but look at left
                //this is why end != mid-1
                end = mid;
            }
            else{
                //you are in ascending part of the array
                start = mid+1; //because we knowthat mid+1 element > mid element
            }
        }
        //in the end , start ==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above  2 checks
        //hence, when they are pointing to just one element, that is the max one
        return start; //or return end both are equal
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,56,78,90};
        int target=78;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it doesnot exist
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            //find the middle element
            //int mid = (start+end)/2; //might be possible that start+end exceeds the range of integer
            int mid = start + (end-start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start= mid+1;
            }else {
                return mid;
            }

        }
        return -1;

    }

}

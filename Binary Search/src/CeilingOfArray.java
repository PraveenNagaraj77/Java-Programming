public class CeilingOfArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18,20,25,27};
        int target = 10;

        int result = findCeiling(arr,target);
        if(result ==-1){
            System.out.println("Ceiling does not exists for " +target);
        }else {
            System.out.println("Cieling of" +target+ "is"+result);
        }
    }

    static int findCeiling(int[] arr, int target){
        //if target is greater than the largest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;

            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                return arr[mid];
            }

        }
        //when the loop ends start will point the cieling element
        return arr[start];
    }

}

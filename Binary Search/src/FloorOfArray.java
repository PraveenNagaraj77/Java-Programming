public class FloorOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20, 25, 27};
        int target = 14;

        int result = findFloor(arr, target);
        if(result == -1){
            System.out.println("Floor does not exist for " + target);
        } else {
            System.out.println("Floor of " + target + " is " + result);
        }
    }

    static int findFloor(int[] arr, int target) {
        // if target is smaller than the smallest number
        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // target found
            }
        }

        // when loop ends, end points to the floor
        return arr[end];
    }
}

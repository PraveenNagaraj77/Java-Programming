import java.util.Arrays;

public class RemoveDuplicatesAtMostTwice {


    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2,2,2, 3, 3 ,1};
        System.out.println("Original array: "+ Arrays.toString(nums));
        int k = removeDuplicates(nums);

        System.out.println("k = " + k);

        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // Already valid if size <= 2

        int i = 2; // Pointer where we place the next valid element

        for (int j = 2; j < n; j++) {
            if (nums[j] != nums[i - 2]) { // Check with the element 2 places back
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

}

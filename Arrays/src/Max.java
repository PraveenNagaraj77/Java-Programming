public class Max {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 11, 3, 2, 12};

        // 1. Find max of entire array
        System.out.println("Max value in array: " + max(arr));

        // 2. Find max in a specific range (e.g., index 1 to 5)
        System.out.println("Max value from index 1 to 5: " + maxRange(arr, 1, 5));

        // 3. Swap two elements (e.g., index 0 and 4)
        swap(arr, 0, 4);
        System.out.print("Array after swapping index 0 and 4: ");
        printArray(arr);

        // 4. Reverse the array
        reverse(arr);
        System.out.print("Array after reverse: ");
        printArray(arr);
    }

    static int max(int[] arr) {
        if (arr.length == 0) return -1;
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start < 0 || end > arr.length || start > end) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
        }
        return maxVal;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

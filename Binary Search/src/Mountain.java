public class Mountain {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 6, 4, 2};
        int peakIndex = findPeakIndex(array);
        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak element: " + array[peakIndex]);
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // You are in the ascending part of the mountain
                start = mid + 1;
            } else {
                // You are in the descending part (or at the peak)
                end = mid;
            }
        }

        // start == end is the peak index
        return start;
    }

}

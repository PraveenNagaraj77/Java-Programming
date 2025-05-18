public class SortingAlgorithms {

    public static void main(String[] args) {
        // Hardcoded array for testing
        int[] inputArray = {64, 25, 12, 22, 11};  // You can change the elements here

        // Clone the input for each sorting algorithm
        int[] bubbleArray = inputArray.clone();
        int[] selectionArray = inputArray.clone();
        int[] insertionArray = inputArray.clone();

        // Apply Bubble Sort
        bubbleSort(bubbleArray);
        printArray(bubbleArray, "Bubble Sort");

        // Apply Selection Sort
        selectionSort(selectionArray);
        printArray(selectionArray, "Selection Sort");

        // Apply Insertion Sort
        insertionSort(insertionArray);
        printArray(insertionArray, "Insertion Sort");
    }

    // Print array with label
    public static void printArray(int[] array, String label) {
        System.out.print(label + ": ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Swap helper method
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int pass = 0; pass < length - 1; pass++) {
            for (int i = 0; i < length - 1 - pass; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}

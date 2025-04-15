import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Initial List: " + list);

        // Get element at index 2
        System.out.println("Element at index 2: " + list.get(2));

        // Set (modify) element at index 3
        list.set(3, 99);
        System.out.println("After modifying index 3: " + list);

        // Remove element at index 1
        list.remove(1);
        System.out.println("After removing index 1: " + list);

        // Loop through the ArrayList
        System.out.print("All elements: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        // Find the max value
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\nMaximum value in list: " + max);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getInput();
        separateAndPrintEvenOdd(numbers);
    }

    // Function to get input from user
    public static ArrayList<Integer> getInput() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 Numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        return list;
    }

    // Function to separate and print even and odd numbers as arrays
    public static void separateAndPrintEvenOdd(ArrayList<Integer> list) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : list) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers Array: " + even);
        System.out.println("Odd Numbers Array: " + odd);
    }
}

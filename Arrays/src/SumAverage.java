import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;

        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg;
        avg = sum / arr.length;
        System.out.println("Sum = "+sum);
        System.out.println("Average = " +avg);
    }
}

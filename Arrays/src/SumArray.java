import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of Numbers : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        int sum=0;
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter number"+ (i+1)+" : " );
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        System.out.println("Sum = " + sum);


    }
}

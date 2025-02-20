import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter Number 1 : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();

        int total = num1+num2;

        System.out.println("Your sum is "+total);

    }
}



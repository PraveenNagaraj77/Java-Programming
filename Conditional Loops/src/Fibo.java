import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        in.close();  // Close scanner to prevent memory leaks

        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = b;
            b = b + a;
            a = temp;
        }

        System.out.println(b);
    }
}

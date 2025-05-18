import java.util.Scanner;

public class NumberToolbox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\n--- Number Analysis ---");
        System.out.println("1. Is Prime? " + isPrime(n));
        System.out.println("2. Square Root: " + squareRoot(n));
        System.out.println("3. Is Armstrong? " + isArmstrong(n));
        System.out.println("4. Is Perfect Number? " + isPerfect(n));
        System.out.println("5. Reverse: " + reverseNumber(n));
        System.out.println("6. Is Palindrome? " + isPalindrome(n));
        System.out.println("7. Decimal to Binary: " + decimalToBinary(n));
        System.out.println("8. Factorial: " + factorial(n));
        System.out.print("Enter second number for LCM & GCF: ");
        int m = sc.nextInt();
        System.out.println("9. GCF (HCF) of " + n + " and " + m + ": " + gcd(n, m));
        System.out.println("10. LCM of " + n + " and " + m + ": " + lcm(n, m));
        System.out.println("11. Factors of " + n + ": ");
        printFactors(n);

        System.out.print("12. Enter a binary number to convert to decimal: ");
        int binary = sc.nextInt();
        System.out.println("13. Binary to Decimal: " + binaryToDecimal(binary));

        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    static double squareRoot(int n) {
        return Math.sqrt(n);
    }

    static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    static int decimalToBinary(int n) {
        int binary = 0, base = 1;
        while (n > 0) {
            int rem = n % 2;
            binary += rem * base;
            base *= 10;
            n /= 2;
        }
        return binary;
    }

    static int binaryToDecimal(int binary) {
        int result = 0, base = 1;
        while (binary > 0) {
            int lastDigit = binary % 10;
            result += lastDigit * base;
            base *= 2;
            binary /= 10;
        }
        return result;
    }

    static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

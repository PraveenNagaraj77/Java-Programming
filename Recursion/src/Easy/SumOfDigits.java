package Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = sumOfNum(n);
        System.out.println("Sum of " + n + " digits is: " +  ans);
    }

    static int sumOfNum(int n){
        if (n == 0) {
            return 0;
        }

        int remainder = n % 10;      // Step 1: Get last digit
        n = n / 10;                  // Step 2: Remove last digit

        return remainder + sumOfNum(n); // Step 3: Add it to recursive result
    }
}

package Easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = product(n);
        System.out.println("Sum of " + n + " digits is: " +  ans);
    }

    static int product(int n){
        if (n == 0) {
            return 1;
        }

        int remainder = n % 10;      // Step 1: Get last digit
        n = n / 10;                  // Step 2: Remove last digit

        return remainder * product(n); // Step 3: Add it to recursive result
    }

}

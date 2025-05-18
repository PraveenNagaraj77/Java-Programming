package Easy;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1331;

        //Iterative check
        if(isPalindrome(n)){
            System.out.println(n + " is a Palindrome Number(Iterative)");
        }else{
            System.out.println(n + " is a not Palindrome Number(Iterative)");
        }


        //recursive check
        if(isPalindromeRecursive(n)){
            System.out.println(n + " is a Palindrome Number(Recursive)");
        }else{
            System.out.println(n + " is a not Palindrome Number(Recursive)");
        }

    }


    static  boolean isPalindrome(int n){
        int original = n;
        int reversed = 0;

        while (n>0){
            int remainder = n%10;
            reversed = reversed * 10 + remainder;
            n = n/10;

        }

        return  original == reversed;

    }


    //Recursive method


    static boolean isPalindromeRecursive(int n ){
        return n == reverseRecursive(n,0);
    }

    static int reverseRecursive(int n ,int rev){
        if(n==0){
            return  rev;
        }

        int remainder = n%10;
        rev = rev * 10 + remainder;
        return reverseRecursive(n/10,rev);

    }


}

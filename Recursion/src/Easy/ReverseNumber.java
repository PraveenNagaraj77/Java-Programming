package Easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1824;
        int ans = Reverse(n);
        System.out.println("Reverse of " + n + " Numbers is : " +  ans );
    }



    static int Reverse(int n){
        return helper(n,0);
    }

    static  int helper(int n , int rev){
        if(n==0){
            return rev;
        }

        int remainder = n %10;

        rev = rev *10 + remainder;


        return helper(n/10,rev);
    }


}

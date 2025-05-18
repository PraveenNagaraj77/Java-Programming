package Easy;



public class FactorialRecursive {
    public static void main(String[] args) {


        int n = 4;
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is:  " + result);
    }

    //Recursion Method
    static long factorial(int n ){
        if(n==0 || n==1){
            return  1;
        }

        return n * factorial(n-1);

    }

    //Normal Loop Method

    static long loopFactorial(int n){
        long fact = 1;

        for (int i = 2; i <=n ; i++) {
            fact = fact*i;
        }
        return fact;
    }

}

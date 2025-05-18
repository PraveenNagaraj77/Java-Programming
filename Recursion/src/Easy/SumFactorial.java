package Easy;

public class SumFactorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = sumFact(n);
        System.out.println("Sum of " + n + " Numbers is : " +  ans );
    }


    static int sumFact(int n){
        if(n<=1){
            return 1;

        }

        return n + sumFact(n-1);

    }


}

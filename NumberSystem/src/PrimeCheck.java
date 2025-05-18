public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29;

        if(isPrime(number)){
            System.out.println(number + " is a Prime Number ");
        }else{
            System.out.println(number + " is a Not a Prime Number ");
        }
    }


    static  boolean isPrime(int n){
        if(n<=1) return  false;
        if(n==2 || n==3 ) return true;
        if(n%2 == 0 || n%3==0 ) return  false;

        //only check till sqrt(n) using 6k+1 optimization

        for (int i = 5; i <=n ; i+=6) {
            if(n%i ==0 || n% (i+2)==0) return false;
        }

        return  true;
    }
}

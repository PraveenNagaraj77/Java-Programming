public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(10);
        System.out.println("Recursive: " + ans);

        int formulaAns = fiboFormula(10);
        System.out.println("Formula: " + formulaAns);
    }

    static int fiboFormula(int n ){
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    static int fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}

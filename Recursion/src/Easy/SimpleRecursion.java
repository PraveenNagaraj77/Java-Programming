package Easy;

public class SimpleRecursion {
    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum from 1 to " + n + " is: " +result);
    }


    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }

}

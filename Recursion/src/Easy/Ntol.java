package Easy;

public class Ntol {
    public static void main(String[] args) {
        funBoth(5);

    }






    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }


    static void funBoth(int n){
        if(n==0){
            return;
        }
        funBoth(n-1);
        System.out.println(n);
    }


}

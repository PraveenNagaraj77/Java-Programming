package Easy;

public class CountZeros {
    public static void main(String[] args) {
        int n = 102023040;


        int countIter = countZerosIterative(n);
        System.out.println("Total Zeros (Iterative)  : " + countIter);

        int countRec  = countZerosRecursive(n);
        System.out.println("Total Zeros (Iterative)  : " + countRec);



    }

     static int countZerosIterative(int n) {
        int count = 0;

        if(n==0) return 1;

        while(n>0){
            if(n%10 == 0 ){
                count++;
            }
            n = n/10;
        }
        return count;
    }

    static int countZerosRecursive(int n) {
        if(n==0) return 1;

        return helper(n,0);

    }

    static int helper(int n,int count){
        if(n==0) return count;

        if(n%10==0){
            return helper(n/10,count+1);
        }

        return helper(n/10,count);

    }



}

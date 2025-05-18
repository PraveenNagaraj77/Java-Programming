public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18,12,7,3,2,1 };
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr==null || arr.length==0){
            return -1;
        }

        //assume ar
        //return minimum value
        int ans = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }

        return ans;
        
    }
}

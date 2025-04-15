import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Enter 5 Numbers : ");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int i=1;

        while(i< nums.length){
            if(nums[i] > max){
                max = nums[i];
            }
            i++;
        }
        System.out.println("Maximum: " + max);
    }
}

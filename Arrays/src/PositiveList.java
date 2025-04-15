import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PositiveList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int num;
        System.out.print("Enter positive numbers(0 to stop): ");

        while((num = sc.nextInt()) !=0){
            if(num>0){
                list.add(num);
            }else{
                System.out.println("Only Positive Numbers Allowed");
            }
        }
        System.out.println("Your LIST" + list);
    }
}

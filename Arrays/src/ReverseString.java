import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();


        int i = str.length()-1;
        String reversed = "";

        while(i>=0){
            reversed += str.charAt(i);
            i--;
        }
        System.out.println("Reversed: " + reversed);
    }
}

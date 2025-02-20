import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

//        SIngle character Check
        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//
//        if(ch>= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        }else if(ch>='A' && ch<='Z'){
//            System.out.println("UpperCase");
//        }else{
//            System.out.println("Not an Alphabetic Character");
//        }

//        Entire word Check

        System.out.println("Enter a word");
        String word = in.next().trim();

        if(word.matches("[a-z]+")){
            System.out.println("Lowercase");
        } else if (word.matches("[A-Z]+")) {
            System.out.println("UpperCase");
        } else if (word.matches("[a-zA-z]+")) {
            System.out.println("Mixed case");
        }else{
            System.out.println("Not an Alphabetic Word");
        }

        in.close();

    }
}

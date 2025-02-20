//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int salary = 11000;


        if(salary > 20000){
            salary+=2000;
        } else if (salary>10000) {
            salary+=3000;
        }else{
            salary+=1000;
        }

        System.out.println(salary);


    }
}
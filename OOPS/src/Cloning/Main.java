package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human praveen = new Human(25,"Praveen");
//        Human twin = new Human(praveen);

        Human twin = (Human) praveen.clone();


        System.out.println(twin.age + " " + twin.name);


    }
}

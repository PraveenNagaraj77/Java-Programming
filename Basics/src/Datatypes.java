import java.awt.*;
import java.util.Date;

public class Datatypes {
    public static void main(String[] args) {
//        Primitive DataTypes
        int age = 24;
        String name = "Praveen";
        float height = 5.9f;
        double weight = 76.9;
        char gender ='M';
        long randomNumbers = 100000000000L;

        System.out.println("Hi my name is " +name +  ". I am  "+age+" Years old.. My weight and Height are " +weight+"kg and "+height+"ft." );

//        Refrence types

        Date today = new Date();
        System.out.println(today);

        Point p1=new Point(5,7);
        Point p2= p1;
        System.out.println(p2);

        p1.x=7;


        System.out.println(p1);
        System.out.println(p2);



    }
}

package Collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        list2.add(34);
        list2.add(35);
        list2.add(36);
        list2.add(89);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(67);
        vector.add(78);
        vector.add(87);


        System.out.println(vector);








    }
}

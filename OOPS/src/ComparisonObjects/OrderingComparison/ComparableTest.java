package ComparisonObjects.OrderingComparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Praveen",25));
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 25));
        users.add(new User("Charlie", 28));

        Collections.sort(users);

        for (User u : users){
            System.out.println(u);
        }


    }
}

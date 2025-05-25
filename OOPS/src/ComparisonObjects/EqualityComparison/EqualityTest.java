package ComparisonObjects.EqualityComparison;

public class EqualityTest {
    public static void main(String[] args) {
        User u1 = new User("Praveen",25);
        User u2 = new User("Praveen",25);
        User u3 = u1;


        System.out.println(u1 == u2);           // false (different references)
        System.out.println(u1.equals(u2));      // true (same values)
        System.out.println(u1 == u3);           // true (same reference)
    }
}

package ComparisonObjects.EqualityComparison;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass() ) return false;

        User user = (User) obj;
        return age == user.age && name.equals(user.name);

    }
}

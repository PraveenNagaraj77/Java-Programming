package Cloning.DeepCopy;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}

class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy
    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.address = this.address.clone(); // Clone the nested object
        return cloned;
    }

    public void display() {
        System.out.println(name + " lives in " + address.city);
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Mumbai");
        Student s1 = new Student("Praveen", addr);

        Student s2 = s1.clone(); // Deep copy

        s1.display(); // Praveen lives in Mumbai
        s2.display(); // Praveen lives in Mumbai

        // Change city in original object
        s1.address.city = "Delhi";

        System.out.println("\nAfter changing address:");
        s1.display(); // Praveen lives in Delhi
        s2.display(); // Praveen lives in Mumbai
    }
}
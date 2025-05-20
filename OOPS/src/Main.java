// Car class - blueprint for a real-world car
class Car {
    String brand;
    String model;
    String engineType;
    double price;

    Car(String brand, String model, String engineType, double price) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.price = price;
    }

    void showCarDetails() {
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Engine     : " + engineType);
        System.out.println("Price (USD): $" + price);
        System.out.println("-----------------------------");
    }

    boolean isMoreExpensiveThan(Car otherCar) {
        return this.price > otherCar.price;
    }

    void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discount = (price * percentage) / 100;
            price = price - discount;
        }
    }
}

// Student class
class Student {
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student() {
        this.rno = 01;
        this.name = "Default Constructor";
        this.marks = 100;
    }


    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }




    void display() {
        System.out.println("Roll No : " + rno);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("-----------------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "Petrol", 22000);
        Car car2 = new Car("Tesla", "Model 3", "Electric", 39990);
        Car car3 = new Car("Ford", "F-150", "Diesel", 30000);

        car1.showCarDetails();
        car2.showCarDetails();
        car3.showCarDetails();

        Student praveen = new Student(76, "Praveen", 85.5f);
        Student s2 = new Student();
        praveen.display();
        s2.display();


        Student random = new Student(praveen);
        random.display();

        car2.applyDiscount(12);
        System.out.println("After Applying 12% discount:");
        car2.showCarDetails();

        System.out.println("Is Tesla more expensive than Ford?");
        System.out.println(car2.isMoreExpensiveThan(car3));
    }
}

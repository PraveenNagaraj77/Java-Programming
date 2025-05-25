package LambdaExpressions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return name + " - " + salary;
    }
}


public class LambdaExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Praveen",70000));
        employees.add(new Employee("Alice", 40000));
        employees.add(new Employee("Bob", 50000));
        employees.add(new Employee("Charlie", 60000));

        System.out.println("Before Sorting");
        employees.forEach(System.out::println);

        //Without Lambda(Using Annonymous Class)

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.salary,o2.salary);
            }
        });


        System.out.println("\\nAfter sorting with Anonymous Class:");
        employees.forEach(System.out::println);


        //With lambda Expression

        Collections.sort(employees,(o1, o2) -> Double.compare(o2.salary, o1.salary));

        System.out.println("\nAfter sorting with Lambda Expression (Descending):");
        employees.forEach(System.out::println);





    }
}

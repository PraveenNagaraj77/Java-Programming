package Cloning.ShallowCopy;



public class ShallowCopyExample {
    public static void main(String[] args) throws  CloneNotSupportedException {
        Address addr = new Address("Vellore");
        Student s1 = new Student("Praveen",addr);


        Student s2 = s1.clone();

        s1.display();
        s2.display();


        //Change the city in the Original Object
        s1.address.city = "Chennai";

        //Both Objects now reflect the change because address is shared

        System.out.println("After Changing Address");
        s1.display();
        s2.display();


    }

}



class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}

class Student implements Cloneable{
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    //SHallow Copy

    public Student clone() throws  CloneNotSupportedException{
        return (Student) super.clone(); //only top level
    }


    public void display(){
        System.out.println(name + " lives in " + address.city);
    }

}
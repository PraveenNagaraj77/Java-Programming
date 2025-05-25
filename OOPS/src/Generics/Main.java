package Generics;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User("Praveen",25);
        ApiResponse<User> response = new ApiResponse<>(true,"User fetched Successfully",user);

        response.printResponse();
        System.out.println();

        //Generic with Single Product
        Product product = new Product("Laptop",60000);
        ApiResponse<Product> productResponse = new ApiResponse<>(true,"Product fetched",product);
        productResponse.printResponse();
        System.out.println();


        //Generic with all list of users

        List<User> userList = new ArrayList<>();
        userList.add(new User("Dhanush",24));
        userList.add(new User("Prasath",23));
        ApiResponse<List<User>> usersResponse = new ApiResponse<>(true,"All users Fetched",userList);
        usersResponse.printResponse();
        System.out.println();

        //Generic with a list of products


        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Iphone16",100000));
        productList.add(new Product("OnePlus11R",50000));
        ApiResponse<List<Product>> productsResponse = new ApiResponse<>(true, "Products retrieved", productList);
        productsResponse.printResponse();





    }
}






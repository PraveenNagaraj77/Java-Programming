package com.praveen.staticExample;

public class Singleton {
    // Step 1: Create a private static instance (eager initialization or use lazy)
    private static Singleton instance;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide public access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // only created once
        }
        return instance;
    }

    // Optional method to test behavior
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

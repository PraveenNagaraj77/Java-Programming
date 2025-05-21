package com.praveen.AbstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am Going to be a Devloper");
    }

    @Override
    void partner() {
        System.out.println("I love Mother ");
    }


}

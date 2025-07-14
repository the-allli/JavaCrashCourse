package com.java.oop.polymorphism;

public class B extends A {
    String name;

    // Method Overriding (runtime polymorphism)
    public void print(String name){
        System.out.println(name);
    }
}
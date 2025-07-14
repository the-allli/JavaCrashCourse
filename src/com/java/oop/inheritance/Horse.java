package com.java.oop.inheritance;

interface Animal {
    void myMethod(); // interface method
}

interface Herbivore {
    void myOtherMethod(); // interface method
}
// Multiple Inheritance
public class Horse implements Animal, Herbivore {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

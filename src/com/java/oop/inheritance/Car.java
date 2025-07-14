package com.java.oop.inheritance;

// Single-Level Inheritance
public class Car extends Vehicle {
    String engine;
    public Car(String company, String name, String engine, String color, String price) {
        super(company, name, color, price);
        this.engine = engine;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return company + "->" + name + "->" + engine + "->" + color + "->" + price;
    }
}
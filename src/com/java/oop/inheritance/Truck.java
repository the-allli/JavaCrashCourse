package com.java.oop.inheritance;

// Hierarchical Inheritance
public class Truck extends Vehicle {
    String wheels;
    public Truck(String company, String name, String wheels, String color, String price) {
        super(company, name, color, price);
        this.wheels = wheels;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return company + "->" + name + "->" + wheels + "->" + color + "->" + price;
    }
}
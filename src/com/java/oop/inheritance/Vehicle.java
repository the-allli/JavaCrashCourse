package com.java.oop.inheritance;

public class Vehicle {
    String company;
    String name;
    String color;
    String price;

    public Vehicle(String company, String name, String color, String price) {
        this.company = company;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return company + "->" + name + "->" + color + "->" + price;
    }
}

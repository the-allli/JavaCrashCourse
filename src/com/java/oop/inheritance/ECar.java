package com.java.oop.inheritance;

// Multi-Level Inheritance
public class ECar extends Car {
    String hp;
    public ECar(String company, String name, String engine, String hp, String color, String price) {
        super(company, name, engine, color, price);
        this.hp = hp;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return company + "->" + name + "->" + engine + "->" + hp+ "->" + color + "->" + price;
    }
}
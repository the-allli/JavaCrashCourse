package com.java.oop;
import com.java.oop.inheritance.*;
import com.java.oop.polymorphism.*;
import com.java.oop.encapsulation.*;

public class Main {
    public static class Bike {

        // Attributes/State
        String color;
        int speed;

        // Constructor
        public Bike(String color, int speed) {
            this.color = color;
            this.speed = speed;
        }

        // Methods/Behaviour
        public void accelerate(int increment) {
            speed += increment;
            System.out.println(speed);
        }
        public void brake(int decrement) {
            speed -= decrement;
        }

        // toString method provides a meaningful string representation of an object's state
        @Override
        public String toString() {
            return "Bike{" +
                    "color=" + color +
                    ", speed=" + speed +
                    '}';
        }
    }

    public static void main(String[] args) {

        // Class, Attributes, Constructor, Methods, toString, Object
        Bike bike = new Bike("Green", 100); // Create a new Car object with color red and speed 100
        bike.accelerate(5);
        System.out.println(bike); //toString method

        // Inheritance
        // Parent-Class, Attributes, Methods, Constructor, Object
        Vehicle vehicle = new Vehicle("Toyota", "GLI", "White", "70k");
        vehicle.display();
        // Single-Level Inheritance
        Car car = new Car("Toyota", "Supra", "2JZ","Red", "700k");
        car.display();
        // Multi-Level Inheritance
        ECar ecar = new ECar("Tesla", "Model-X", "Electric", "800", "Red", "7000k");
        ecar.display();
        // Hierarchical Inheritance
        Truck truck = new Truck("Toyota", "Tundra", "6", "Red", "500k");
        truck.display();
        // Multiple Inheritance
        Horse inter = new Horse();
        inter.myMethod();
        inter.myOtherMethod();

        // Polymorphism
        A a1 = new A();
        a1.a = 5;
        a1.b = 10;
        // Method Overloading
        a1.print(5, 10);
        a1.print(5);
        a1.print();
        // Method Overriding
        B b1 = new B();
        b1.print("Ali");

        // Encapsulation
        Person myObj = new Person();
        myObj.setName("Ali"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());

    }
}

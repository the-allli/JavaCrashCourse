package com.java.oop;

public class Main {
    public static class Car {

        // Attributes/State
        String color;
        int speed;

        // Constructor
        public Car(String color, int speed) {
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
            return "Car{" +
                    "color=" + color +
                    ", speed=" + speed +
                    '}';
        }
    }

    public static void main(String[] args) {

        // Class, Attributes, Constructor, Methods, toString, Object
        Car car = new Car("Green", 100); // Create a new Car object with color red and speed 100
        car.accelerate(5);
        System.out.println(car); //toString method
    }
}

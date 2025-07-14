package com.java.oop.polymorphism;

public class A {
    public int a,b;

    // Method Overloading (compile-time polymorphism)
    public void print(int a, int b){
        System.out.println(a+b);
    }
    public void print(int a){
        System.out.println(a);
    }
    public void print(){
        System.out.println(this.a+this.b);
    }
}
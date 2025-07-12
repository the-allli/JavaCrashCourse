package com.java.corejava.scope;

public class Test {
    // Method Overloading: Same method name with different parameters
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    // Example of a recursive method
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        /*
         * Methods in Java are blocks of code that perform a specific task.
         * They can take parameters and return values.
         * Methods help in code reusability.
         */
        int sum = add(5, 10);
        System.out.println("Sum of ints: " + sum);

        // Method Overloading example
        double sum2 = add(2.5, 2.5);
        System.out.println("Sum of doubles: " + sum2);


        // Types of Scope in Java
        // 1. Local Scope: Variables defined within a method.
        int localVar = 10; // Local variable
        System.out.println("Local Variable: " + localVar);

        // 2. Instance Scope: Variables defined in a class but outside any method.
        class Example {
            int instanceVar = 20; // Instance variable
        }
        Example example = new Example();
        System.out.println("Instance Variable: " + example.instanceVar);

        // 3. Static Scope: Variables defined with the static keyword, shared across all instances of a class.
        class StaticExample {
            static int staticVar = 30; // Static variable
        }
        System.out.println("Static Variable: " + StaticExample.staticVar);

        // 4. Block Scope: Variables defined within a block of code, such as loops or conditionals.
        for (int i = 0; i < 5; i++) {
            int blockVar = i * 2; // Block variable
            System.out.println("Block Variable: " + blockVar);
        }

        // 5. Method Scope: Variables defined within a method, accessible only within that method.
        class MethodScopeExample {
            void method() {
                int methodVar = 40; // Method variable
                System.out.println("Method Variable: " + methodVar);
            }
        }

        // Recursion
        int factorial = factorial(5);


    }
}

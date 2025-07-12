package com.java.corejava.operators;

public class Test {
    public static void main(String[] args) {
        /*
         * Operators in Java
         * 1. Arithmetic Operators
         * 2. Comparison Operators
         * 3. Logical Operators
         * 4. Bitwise Operators
         * 5. Assignment Operators
         * 6. Unary Operators
         */

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Pre-Increment: " + (++a));
        System.out.println("Pre-Decrement: " + (--b));
        System.out.println("Post-Increment: " + (a++));
        System.out.println("Post-Decrement: " + (b--));

        // Comparison Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise Operators
        int m = 5, n = 3; // m = 0101, n = 0011 in binary
        System.out.println("Bitwise AND: " + (m & n));
        System.out.println("Bitwise OR: " + (m | n));
        System.out.println("Bitwise XOR: " + (m ^ n));
        System.out.println("Bitwise Complement of m: " + (~m));
        System.out.println("Left Shift m by 1: " + (m << 1));
        System.out.println("Right Shift m by 1: " + (m >> 1));
        System.out.println("Unsigned Right Shift m by 1: " + (m >>> 1));
        System.out.println("Unsigned Left Shift m by 1: " + (m >>> 1));

        // Unary Operators
        int num = 5;
        System.out.println("Unary Plus: " + (+num));
        System.out.println("Unary Minus: " + (-num));

        // Assignment Operators
        int p = 10;
        p += 5; // p = p + 5;
        System.out.println("After += : " + p);
        p -= 3; // p = p - 3;
        System.out.println("After -= : " + p);
        p *= 2; // p = p * 2;
        System.out.println("After *= : " + p);
        p /= 4; // p = p / 4;
        System.out.println("After /= : " + p);
        p %= 5; // p = p % 5;
        System.out.println("After %= : " + p);
        p &= 2; // p = p & 2;
        System.out.println("After &= : " + p);
        p |= 3; // p = p | 3;
        System.out.println("After |= : " + p);
        p ^= 1; // p = p ^ 1;
        System.out.println("After ^= : " + p);
        p <<= 1; // p = p << 1;
        System.out.println("After <<= : " + p);
        p >>= 1; // p = p >> 1;
        System.out.println("After >>= : " + p);
    }
}

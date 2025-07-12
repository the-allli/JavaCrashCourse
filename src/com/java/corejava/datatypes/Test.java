package com.java.corejava.datatypes;

public class Test {
    public static void main(String[] args) {
        /*
         * Primitive - byte, short, int, float, long, double, boolean and char (Stored in Stack)
         * Non-primitive - String, Arrays, classes, interfaces, enums (Stored in Heap)
         */
        // data_type var_name = value;

        // Primitive Data Types
        byte b = 10; // 1 byte
        short s = 20; // 2 bytes
        int i = 30; // 4 bytes
        long l = 40L; // 8 bytes
        float f = 50.5f; // 4 bytes
        double d = 60.5; // 8 bytes
        char c = 'A'; // 2 bytes
        boolean bool = true; // 1 bit

        // Non-Primitive Data Types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};
        class SampleClass {
        }
        interface SampleInterface {
        }
        enum SampleEnum {
        }

        // Type Casting (Widening/Narrowing Conversion)
        /* JVM Memory
        * 1.Stack Memory 🛠️
            Stores method calls, local variables, and references to objects.
            Each thread has its own stack.
            When a method is called, a new frame is pushed onto the stack.
            When a method finishes, its frame is removed.

        * 2.Heap Memory 🏗️
            Stores objects created using new.
            Shared among all threads.
            Divided into:
                Young Generation (contains newly created objects)
                Old Generation (Tenured) (stores long-lived objects)
                Eden Space (initial area for new objects)
                Survivor Spaces (holds objects that survive garbage collection)
                Method Area (MetaSpace) 🧠
                    Stores class metadata, static variables, and constants/String Pool.
                    Includes the Runtime Constant/String Pool, which holds literals and symbol references.

            String str = "Hello, World!"; // String Literal (Heap->String_Pool)
            String str1 = "Hello, World!"; // Reuses same object from String Pool
            String str2 =  new String("Hello, World!"); // using Constructor (Stored in Heap)
            String str3 = str2.intern(); // Moves to the String Pool

        * 3.PC Register 🔄
            Holds the address of the current execution instruction.
            Every thread has its own PC register.

        * 4.Native Method Stack 🌍
            Handles native method calls (methods implemented in languages like C/C++).
            Not directly controlled by Java, but managed by the OS.

        * 5.Garbage Collection 🚮
            The JVM automatically clears unused objects from the heap using garbage collection.
            Different algorithms include Mark-and-Sweep, Generational GC, and G1 GC.
        */
    }
}

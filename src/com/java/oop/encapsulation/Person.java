package com.java.oop.encapsulation;
/*
        * Access Modifiers - controls the access level
        * Non-Access Modifiers - do not control access level, but provides other functionality
        */

        // Access Modifiers for class
        /*
        * public => The class is accessible by any other class
        * default => The class is only accessible by classes in the same package.
        */

        // Access Modifiers for attributes, methods and constructors
        /*
        * public => The code is accessible for all classes
        * private => The code is only accessible within the declared class
        * protected => The code is accessible in the same package and subclasses.
        * default => The code is only accessible in the same package.
        */

        // Non-Access Modifiers for class
        /*
        * final => The class cannot be inherited by other classes.
        * abstract => The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.
        */

        // Non-Access Modifiers for attributes & methods
        /*
        * final => Attributes and methods cannot be overridden/modified
        * static => Attributes and methods belongs to the class, rather than an object
        * abstract => Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
        * transient => Attributes and methods are skipped when serializing the object containing them
        * synchronized => Methods can only be accessed by one thread at a time
        * volatile => The value of an attribute is not cached thread-locally, and is always read from the "main memory"
        */
public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
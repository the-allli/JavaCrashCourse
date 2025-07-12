package com.java.corejava.controlflow;

public class Test {
    public static void main(String[] args) {
        int number = 10;

        // if-else_if_else
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // switch
        switch (number) {
            case 1:
                System.out.println("Number is one");
                break;
            case 10:
                System.out.println("Number is ten");
                break;
            default:
                System.out.println("Number is neither one nor ten");
                break;
        }

        // Ternary Operator
        String result = (number > 0) ? "Positive" : "Non-positive";
        System.out.println("Using Ternary Operator: " + result);
    }

}

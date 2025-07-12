package com.java.corejava.arrays;

public class Test {
    public static void main(String[] args) {
        // Single-dimensional array
        int[] singleArray = {1, 2, 3, 4, 5};
        System.out.println("Single-dimensional array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.println("Element at index " + i + ": " + singleArray[i]);
        }

        // Multi-dimensional array
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nMulti-dimensional array:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

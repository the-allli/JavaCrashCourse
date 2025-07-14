package com.java.multithreading;

public class Demo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long count = 0;
        for (long i = 0; i <= 90000000; i++){
            if(i % 10 == 7){
                count++;
            }
        }
        System.out.println("Count of number ending in 7: " + count);

        long sum = 0;
        for (long i = 0; i <= 90000000; i++){
            sum+=i;
        }
        System.out.println("Sum: " + sum);

        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");

    }
}

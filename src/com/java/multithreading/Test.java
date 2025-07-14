package com.java.multithreading;

class NumberCounter extends Thread {
    @Override
    public void run() {
        long count = 0;
        for (long i = 0; i <= 90000000; i++){
            if(i % 10 == 7){
                count++;
            }
        }
        System.out.println("Count of number ending in 7: " + count);
    }
}

class SumCalculator implements Runnable{
    @Override
    public void run() {
        long sum = 0;
        for (long i = 0; i <= 90000000; i++){
            sum+=i;
        }
        System.out.println("Sum: " + sum);
    }
}

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        NumberCounter thread1 = new NumberCounter();
        SumCalculator sc = new SumCalculator();
        Thread thread2 = new Thread(sc);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

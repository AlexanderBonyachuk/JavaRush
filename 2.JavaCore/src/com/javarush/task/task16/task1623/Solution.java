package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount = 0;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
//            super(String.valueOf(++createdThreadCount));
            super(Integer.toString(++Solution.createdThreadCount));
            start();
        }

        @Override
        public String toString() {
            return this.getName() + " created";
        }

        public void run() {
            if ((Solution.createdThreadCount < Solution.count)) {
                System.out.println(new GenerateThread());
            }
        }
    }
}

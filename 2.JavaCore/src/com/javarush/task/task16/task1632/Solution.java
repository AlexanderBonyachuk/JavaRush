package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static class MyThread1 extends Thread {
            public void run() {
                while (true) {
                    int i = 0;
                    i++;
                }
            }
        }

    static class MyThread2 extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    static class MyThread3 extends Thread {
            public void run() {
               while (true) {
                   try {
                       System.out.println("Ура");
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        }

    static class MyThread4 extends Thread implements Message{
        boolean work = true;
        public void run() {
                while (work) {}
            }
            public void showWarning() {
                work = false;
            }
        }

    static class MyThread5 extends Thread {
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                while (true) {
                    try {
                        String word = reader.readLine();
                        if (word.equals("N")) { break; } else {
                            sum += Integer.parseInt(word);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(sum);
            }
        }
    static {
    threads.add(new MyThread1());
    threads.add(new MyThread2());
    threads.add(new MyThread3());
    threads.add(new MyThread4());
//        MyThread5 t5 = new MyThread5();
    threads.add(new MyThread5());
//        try {
//            t5.join();
//            t5.start();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    public static void main(String[] args) {

    }
}
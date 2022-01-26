package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }
    public interface CanClimb {
        void climb();
    }
    public interface CanRun {
        void run();
    }

    public class Cat implements CanRun, CanClimb {
         public void run() {
            System.out.println("RUN");
        }
        public void climb() {
            System.out.println("CLIMB");
        }
    }

    public class Dog implements CanRun {
        public void run() {
            System.out.println("RUN");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        public void run() {
            System.out.println("RUN");
        }
        public void fly() {
            System.out.println("FLY");
        }
    }
}

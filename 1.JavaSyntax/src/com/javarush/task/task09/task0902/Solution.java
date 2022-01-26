package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] met = Thread.currentThread().getStackTrace();
        String st = met[2].getMethodName();   // met это массив с 3мя элементами, в ячеке 2 хранится метод корый вызвал выполняемы метод
//        System.out.println(st);
        return st;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] met = Thread.currentThread().getStackTrace();
        String st = met[2].getMethodName();
//        System.out.println(st);
        return st;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] met = Thread.currentThread().getStackTrace();
        String st = met[2].getMethodName();
//        System.out.println(st);
        return st;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] met = Thread.currentThread().getStackTrace();
        String st = met[2].getMethodName();
//        System.out.println(st);
        return st;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] met = Thread.currentThread().getStackTrace();
        String st = met[2].getMethodName();
//        System.out.println(st);
        return st;
    }
}

package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] met1 = Thread.currentThread().getStackTrace();
        int num = met1[2].getLineNumber();
//        System.out.println(num);
        return  /*напишите тут ваш код*/ num;
    }

    public static int method2() {
        method3();
        StackTraceElement[] met1 = Thread.currentThread().getStackTrace();
//        System.out.println(met1[2].getLineNumber());
        return  /*напишите тут ваш код*/ met1[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] met1 = Thread.currentThread().getStackTrace();
//        System.out.println(met1[2].getLineNumber());
        return  /*напишите тут ваш код*/ met1[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] met1 = Thread.currentThread().getStackTrace();
//        System.out.println(met1[2].getLineNumber());
        return  /*напишите тут ваш код*/ met1[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] met1 = Thread.currentThread().getStackTrace();
//        System.out.println(met1[2].getLineNumber());
        return  /*напишите тут ваш код*/ met1[2].getLineNumber();
    }
}

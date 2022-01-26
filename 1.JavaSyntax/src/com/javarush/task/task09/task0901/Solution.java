package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements1 = Thread.currentThread().getStackTrace();
        return stackTraceElements1;
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements2 = Thread.currentThread().getStackTrace();
        return stackTraceElements2;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements3 = Thread.currentThread().getStackTrace();
        return stackTraceElements3;
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements4 = Thread.currentThread().getStackTrace();
        return stackTraceElements4;
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements5 = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements5) {
//            System.out.println(element.getMethodName());
//        }
        return stackTraceElements5;
    }
}

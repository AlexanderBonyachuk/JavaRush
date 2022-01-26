package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] method = Thread.currentThread().getStackTrace();

            System.out.print(method[2].getClassName() + ": ");
            System.out.print(method[2].getMethodName() + ": ");
            System.out.println(text);
    }
}

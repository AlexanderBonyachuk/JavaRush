package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());

        if(a>=1 && a<=999) {

            if (a % 2 == 0 && a < 10)
                System.out.println("четное однозначное число");
            if (a % 2 != 0 && a < 10)
                System.out.println("нечетное однозначное число");
            if (a % 2 == 0 && a >= 10 && a < 100)
                System.out.println("четное двузначное число");
            if (a % 2 != 0 && a >= 10 && a < 100)
                System.out.println("нечетное двузначное число");
            if (a % 2 == 0 && a >= 100 && a < 1000)
                System.out.println("четное трехзначное число");
            if (a % 2 != 0 && a >= 100 && a < 1000)
                System.out.println("нечетное трехзначное число");
        }

    }
}

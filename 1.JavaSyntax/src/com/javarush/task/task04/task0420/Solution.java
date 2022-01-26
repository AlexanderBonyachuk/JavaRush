package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());

        int a1 = a, b1 = b, c1 = c, bufer;

        if (a<b) {
            a1 = b;
            b1 = a;
            c1 = c;
//            System.out.println("Шаг 1 : " + a1 + " " +b1 + " " +c1);
        }

        if (a1<c) {
            c1 = b1;
            b1 = a1;
            a1 = c;
//            System.out.println("Шаг 2 : " + a1 + " " +b1 + " " +c1);

        }
        if (b1<c1) {
            a1 = a1;
            bufer = c1;
            c1 = b1;
            b1 = bufer;
//            System.out.println("Шаг 3 : " + a1 + " " +b1 + " " +c1);
        }

        System.out.println(a1 + " " +b1 + " " +c1);

    }
}

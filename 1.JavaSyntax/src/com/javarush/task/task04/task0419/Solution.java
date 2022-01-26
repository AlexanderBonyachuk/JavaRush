package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());
        int d = Integer.parseInt(number.readLine());

        int max = a;

        if (b>max)
            max = b;
        if (c>max)
            max = c;
        if (d>max)
            max = d;
        System.out.println(max);



    }
}

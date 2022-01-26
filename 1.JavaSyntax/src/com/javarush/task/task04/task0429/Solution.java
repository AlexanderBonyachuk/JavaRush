package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());

        int count1 = 0, count2 = 0;

        if (a>0)
            count1++;
        if (a<0)
            count2++;
        if (b>0)
            count1++;
        if (b<0)
            count2++;
        if (c>0)
            count1++;
        if (c<0)
            count2++;
        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);

    }
}

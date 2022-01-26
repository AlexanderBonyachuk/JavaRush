package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());


        if (a == 0)
            System.out.println("ноль");
        if (a<0 && (a%2 == 0))
            System.out.println("отрицательное четное число");
        if (a<0 && (a%2 != 0))
            System.out.println("отрицательное нечетное число");
        if (a>0 && (a%2 == 0))
            System.out.println("положительное четное число");
        if (a>0 && (a%2 != 0))
            System.out.println("положительное нечетное число");

    }
}

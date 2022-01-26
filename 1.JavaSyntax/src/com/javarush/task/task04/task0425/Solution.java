package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        if (a>0 && b>0)
            System.out.println(1);
        if (a<0 && b>0)
            System.out.println(2);
        if (a<0 && b<0)
            System.out.println(3);
        if (a>0 && b<0)
            System.out.println(4);
    }
}

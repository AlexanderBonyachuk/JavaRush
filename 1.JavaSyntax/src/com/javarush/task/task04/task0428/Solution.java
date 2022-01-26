package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());

        int count=0;

        if (a>0)
            count++;
        if (b>0)
            count++;
        if (c>0)
            count++;
        System.out.println(count);


    }
}

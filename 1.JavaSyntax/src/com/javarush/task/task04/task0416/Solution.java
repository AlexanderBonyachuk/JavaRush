package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = reader % 5;
//        int n = System.in.read();
//        close();
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        a %= 5;
//        System.out.println(a);
        if (a>=0.0 && a <3.0)
            System.out.println("зелёный");
        else
            if (a>=3.0 && a<4.0)
                System.out.println("жёлтый");
            else
                 if (a>=4.0 && a<=5.0)
                      System.out.println("красный");



    }
}
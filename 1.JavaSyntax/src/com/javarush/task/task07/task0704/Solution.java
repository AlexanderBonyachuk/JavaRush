package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int c[] = new int[10];

        for (int i = 0; i < c.length; i++) {
            int chislo = Integer.parseInt(number.readLine());
            c[i] = chislo;
        }

        for (int i = c.length -1 ; i >= 0; i--) {
            System.out.println(c[i]);
        }


    }
}


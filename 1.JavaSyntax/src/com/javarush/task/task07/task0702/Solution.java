package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        String c[] = new String[10];

        for (int i = 0; i < 8; i++) {
            String s = number.readLine();
            c[i] = s;
        }

        for (int i = c.length -1 ; i >= 0; i--) {
            System.out.println(c[i]);
        }
    }
}
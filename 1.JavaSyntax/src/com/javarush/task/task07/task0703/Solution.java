package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String letter[] = new String[10];
        int number[] = new int[10];

        for (int i = 0; i < letter.length; i++) {
            String simbol = in.readLine();
            letter[i] = simbol;
            number[i] = letter[i].length();
        }

        for (int i = 0; i < letter.length; i++) {
            System.out.println(number[i]);
        }


    }
}

package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int c[] = new int[15];

        for (int i = 0; i < c.length; i++) {
            int chislo = Integer.parseInt(number.readLine());
            c[i] = chislo;
        }

        int chetn = 0, neChetn =0;

        for (int i = 0; i < c.length; i++) {
            if ((i == 0) || (i % 2 == 0))
                chetn += c[i];
            else
                neChetn += c[i];

        }

        if (chetn > neChetn)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}

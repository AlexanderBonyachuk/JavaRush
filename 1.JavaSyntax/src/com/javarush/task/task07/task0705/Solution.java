package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int c[] = new int[20];
        int []a = new int[10];
        int []b = new int[10];

        for (int i = 0; i < c.length; i++) {
            int chislo = Integer.parseInt(number.readLine());
            c[i] = chislo;
        }
        a = Arrays.copyOf(c, 10);
        b = Arrays.copyOfRange(c,10,c.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}

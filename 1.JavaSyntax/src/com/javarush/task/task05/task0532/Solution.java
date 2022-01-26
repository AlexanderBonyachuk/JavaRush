package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum =0;

        if (n>0) {
            int b = Integer.parseInt(reader.readLine());

            maximum = b;

            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                if (a >= maximum)
                    maximum = a;
            }

            System.out.println(maximum);
        }


        //напишите тут ваш код


    }
}

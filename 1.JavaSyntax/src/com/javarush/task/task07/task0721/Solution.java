package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        int maximum;
        int minimum;

        //напишите тут ваш код
        int list2 [] = new int [20];
        list2 = Arrays.copyOf(getInts(), 20);

        Arrays.sort(list2);
        maximum = list2[19];
        minimum = list2[0];

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public  static int[] getInts()  throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int list [] = new int [20];
        for (int i = 0; i < 20; i++) { // чтение массива
            int a = Integer.parseInt(reader.readLine());
            list[i] = a;
        }
        return list;
    }
}

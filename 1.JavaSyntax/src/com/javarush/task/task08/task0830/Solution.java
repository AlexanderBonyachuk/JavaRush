package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
//        Arrays.sort(array);          // нормальная сортировка в 1 строку

        for (int i = 1; i < array.length; i++) {          // Челночнаыя сортировка (Shuttle Sort)
            if (isGreaterThan(array[i-1], array[i])) {
                String vrem = array[i-1];
                array[i-1] = array[i];
                array[i] = vrem;
                for (int z = i-1; (z-1) >= 0; z--) {
                    if (isGreaterThan(array[z-1], array[z])) {
                        String vrem2 = array[z-1];
                        array[z-1] = array[z];
                        array[z] = vrem2;
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

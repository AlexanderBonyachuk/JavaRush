package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();

        while (true) {

            String key = reader.readLine();   // заполняем мапу
            if (key.isEmpty())
                break;
            String value = reader.readLine();
            map.put(key, value);
        }

        // Read the house number

        String k = reader.readLine();        // считываем город

        String o = map.get(k);               // определяем по ключу значение - фамилию
        System.out.println(o);

    }
}

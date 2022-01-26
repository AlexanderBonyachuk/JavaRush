package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mapa = new HashMap<>();

        while (true) {
            String s1 = reader.readLine();
            if (s1.isEmpty())
                break;
            int id = Integer.parseInt(s1);
            String name = reader.readLine();
            mapa.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : mapa.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

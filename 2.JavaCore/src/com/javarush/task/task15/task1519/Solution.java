package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        boolean work = true;
        while (work) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word = reader.readLine();
            try {
                if (word.equals("exit")) {
                    work = false;
                } else {
                    if (word.contains(".")) {
                        Double numD = Double.parseDouble(word);
                        print(numD);
                    } else {
                        int numS = Integer.parseInt(word);
                        if (0 < numS && numS < 128) {
                            print((short) numS);
                        } else {
                            print(numS);
                        }
                    }
                }
            } catch (NumberFormatException e) {
                print(word);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

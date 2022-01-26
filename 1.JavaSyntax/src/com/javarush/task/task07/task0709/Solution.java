package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<String>();
        BufferedReader stroka = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {
            String elem = stroka.readLine();
            s.add(elem);
        }

        int min = s.get(0).length();

        for (int i=1; i<5; i++) {
            if (s.get(i).length() < min) {
                min = s.get(i).length();
            }
        }

        for (int j=0; j < 5; j++) {
            if (s.get(j).length() == min)
            s2.add(s.get(j));
        }

        for (int j=0; j < s2.size(); j++) {
            System.out.println(s2.get(j));
        }

    }
}
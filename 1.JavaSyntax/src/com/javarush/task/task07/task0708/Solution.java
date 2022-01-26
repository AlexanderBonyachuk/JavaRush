package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Solution.strings = new ArrayList<String>();
        BufferedReader st = new BufferedReader(new InputStreamReader(System.in));

        int maxLength = -1;

        for (int i=0; i<5; ++i) {
            strings.add( st.readLine() );
            if (strings.get(i).length() > maxLength)
                maxLength = strings.get(i).length();
        }

        for (String n : strings) {
            if ( n.length() == maxLength)
                System.out.println(n);
        }

    }
}
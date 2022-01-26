package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("мама");
        strings.add("именно");
        strings.add("мыла");
        strings.add("именно");
        strings.add("раму");
        strings.add("именно");

        for (String x : strings) {
            System.out.println(x);
        }

    }
}

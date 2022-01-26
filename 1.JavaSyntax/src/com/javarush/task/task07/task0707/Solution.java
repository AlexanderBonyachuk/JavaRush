package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<String>();
        s.add("строка 1");
        s.add("строка 2");
        s.add("строка 3");
        s.add("строка 4");
        s.add("строка 5");

        System.out.println(s.size());

        for (int i=0; i<5; i++)
            System.out.println(s.get(i));

    }
}

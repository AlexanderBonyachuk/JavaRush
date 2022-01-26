package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
listMoth.add("January");   // Ctrl+ R
listMoth.add("February");

 */

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        ArrayList<String> listMoth = new ArrayList<>();
        listMoth.add("January");
        listMoth.add("February");        // Ctrl+ R чтобы вставить список и преобразовать его по шаблону
        listMoth.add("March");
        listMoth.add("April");
        listMoth.add("May");
        listMoth.add("June");
        listMoth.add("July");
        listMoth.add("August");
        listMoth.add("September");
        listMoth.add("October");
        listMoth.add("November");
        listMoth.add("December");

        for (int i = 0; i < listMoth.size(); i++) {
            String s = listMoth.get(i);
            if (month.equals(s))
                System.out.println(s + " is the " + (i+1) + " month");
        }

    }
}

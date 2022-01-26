package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        String s = red.readLine();                                                  // читаем строчку

        // распознаем строчку в формате год - меяц - день
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-d");
        // выводим строчку в формате месяц (на английском) день, год
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        try {
            Date date1 = formatter1.parse(s);
            System.out.println(formatter2.format(date1).toUpperCase());  //делем чтобы день выводился большими буквами
        }
        catch (Exception e) {
            e.printStackTrace();  // это тут особо не нужно
        }

    }
}

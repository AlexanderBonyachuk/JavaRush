package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 10 2013"));
    }

    public static boolean isDateOdd(String date) {
        boolean d = false;
        SimpleDateFormat formater = new SimpleDateFormat("MMM-d-yyyy");  // распознаем строчку как дату
        Date date1 = new Date(date);

        Calendar calendar = Calendar.getInstance();  // создаем календарь, чтобы определять месяц, день, год
        calendar.setTime(date1);

        int day = calendar.get(Calendar.DAY_OF_YEAR); // определяем день с начала года

        if (day % 2 != 0) {
            d = true;
        }

        return d;
    }
}

package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Иванов", dateFormat.parse("JUNE 20 2010"));
        map.put("Митрофанов", dateFormat.parse("AUGUST 5 2005"));
        map.put("Кулагин", dateFormat.parse("MAY 28 2013"));
        map.put("Боярин", dateFormat.parse("SEPTEMBER 2 2001"));
        map.put("Титулин", dateFormat.parse("DECEMBER 11 2008"));
        map.put("Дроздов", dateFormat.parse("FEBRUARY 6 2011"));
        map.put("Дронов", dateFormat.parse("APRIL 18 2009"));
        map.put("Косенко", dateFormat.parse("AUGUST 1 2010"));
        map.put("Наумова", dateFormat.parse("JULY 1 2015"));

// map.forEach((a,b) -> System.out.println(a + " " + b)); // это для проверки и просмотра вывода на экран

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map)  {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Date> p = it.next();
            Date value = p.getValue();
            String e = value.toString();
            if (e.contains("Jun") || e.contains("Jul") || e.contains("Aug"))   // т.к. август выводится в таком виде: Aug , никакой не AUGUST
                it.remove();
        }

//        map.forEach((a,b) -> System.out.println(a + " " + b)); // это для проверки и просмотра вывода на экран

    }

    public static void main(String[] args) throws ParseException {
//        Map<String, Date> map2 = createMap(); // это для проверки и просмотра вывода на экран
//        System.out.println("\n");
//        removeAllSummerPeople(map2);
    }
}

package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();

        map.put("Иванов", "Иван");
        map.put("Касаткина", "Дарья");
        map.put("Дроздов", "Пётр");
        map.put("Петорв", "Иван");
        map.put("Петров", "Кирилл");
        map.put("Иванов2", "Кирилл");
        map.put("Петров2", "Иван");
        map.put("Николаев", "Дмитрий");
        map.put("Кирюшин", "Пётр");
        map.put("Светлова", "Дарья");

//        map.forEach((a,b) -> System.out.println(a + " " + b)); // это для проверки и просмотра вывода на экран

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int nam = 0;

        for (Map.Entry<String, String> n : map.entrySet()) {
            String value = n.getValue();
            if (value.equals(name))
                nam++;
        }

//        System.out.println(nam); // это для проверки и просмотра вывода на экран

        return nam;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код

        int family = 0;

        for (Map.Entry<String, String> n : map.entrySet()) {
            String key = n.getKey();
            if (key.equals(lastName))
                family++;
        }

//        System.out.println(family);  // это для проверки и просмотра вывода на экран

        return family;

    }

    public static void main(String[] args) {
//        Map<String, String> map2 = createMap();   // это для проверки и просмотра вывода на экран
//        getCountTheSameFirstName(map2, "Иван");
//        getCountTheSameLastName(map2, "Петров");
    }
}

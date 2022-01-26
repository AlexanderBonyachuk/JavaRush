package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Касаткина", "Дарья");
        map.put("Дроздов", "Пётр");
        map.put("Петорв", "Иван");
        map.put("Петров", "Кирилл");
        map.put("Иванов", "Кирилл");
        map.put("Петров", "Иван");
        map.put("Николаев", "Дмитрий");
        map.put("Кирюшин", "Пётр");
        map.put("Светлова", "Дарья");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

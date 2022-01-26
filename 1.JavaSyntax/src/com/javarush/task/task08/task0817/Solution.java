package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> map2 = new HashMap<String, String>(map);
        int bb=0;
        for (Map.Entry<String, String> pair : map2.entrySet()) {
//            System.out.println("мы в removeTheFirstNameDuplicates");  // это для проверки и просмотра вывода на экран
            String value1 = pair.getValue();
            int counter = 0;
            bb++;
//            System.out.println("counter = " + counter);
            for (Map.Entry<String, String> p : map2.entrySet()) {
//                System.out.println("мы в втором подцикле: " + bb);  // это для проверки и просмотра вывод
                String value2 = p.getValue();
                if (value2.equals(value1))
                    counter++;
                if (counter >1)
                    removeItemFromMapByValue(map, value1);
            }

        }
//        map.forEach((a,b) -> System.out.println(a + " " + b));  // это для проверки и просмотра вывода на экран
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map2 = createMap();   // это для проверки и просмотра вывода на экран
//        removeTheFirstNameDuplicates(map2);

    }
}

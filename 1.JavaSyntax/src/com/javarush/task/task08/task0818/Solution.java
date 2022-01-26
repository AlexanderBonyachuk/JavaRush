package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < 10; i++) {
            map.put("Фамилия" + i, 450 + i*10);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            int value = pair.getValue();
            if (value <500) {
                it.remove();  // пользумеся командой ремов именно для итератора, для объекта map это не пройдет
            }
        }
//        map.forEach((a,b) -> System.out.println(a + " " + b));
    }

    public static void main(String[] args) {
//        Map<String, Integer> map2 = createMap();       //  это все для просмотра результатов
//        map2.forEach((a,b) -> System.out.println(a + " " + b));
//
//        System.out.println("\n");
//
//        removeItemFromMap(map2);

    }
}
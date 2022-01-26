package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set1 = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            set1.add("Литер" + i);
        }
        return set1;
    }

    public static void main(String[] args) {
//        Set<String> set2 = createSet();
//        set2.forEach(s -> System.out.println(s + " "));  // тут просто выывожу на экран для проверки
    }
}

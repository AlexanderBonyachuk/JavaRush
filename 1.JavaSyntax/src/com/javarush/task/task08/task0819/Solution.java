package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.toArray()[0]);   // удваление одного кота
//        Iterator<Cat> it = cats.iterator();
//        while (it.hasNext()) {
//            for (int i = 0; i < 3; i++) {
//                Cat catX = it.next();
//                if (i == 1)
//                    it.remove();
//            }
//
//        }


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    // step 1 - пункт 1
    public  static class Cat {

    }
}

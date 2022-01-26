package com.javarush.task.task08.task0820;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

//        System.out.println("\n");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
//            System.out.println("кошки " + i);
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogi = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            dogi.add(new Dog());
//            System.out.println("собаки " + i);
        }
//        System.out.println("псы : ");
//        for (Dog ob : dogi) {
//            System.out.println(ob);
//        }
//        System.out.println("\n");
        return dogi;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object>  obj = new HashSet<>();

        for (int i = 0; i < cats.size(); i++) {
//            System.out.println(cats.toArray()[i]);
            obj.add(cats.toArray()[i]);
        }
//        System.out.println("коты : ");
//        for (Object ob : obj) {
//            System.out.println(ob);
//        }
//        System.out.println("\n");
//        System.out.println(dogs.size());
        for (int i = 0; i < dogs.size(); i++) {
            obj.add(dogs.toArray()[i]);
        }
//        System.out.println("объект : ");
//        for (Object ob : obj) {
//            System.out.println(ob);
//        }
        return obj;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

        pets.removeAll(cats);

//        Set<Object> pets2 = new HashSet<>();
//
//        int lenghtP = pets.size();
//        int count =0, cc=0;
//
//        for (int i=0 ;i < pets.size();i++) {
//
//            Object a =pets.toArray()[i];
////            count++;
//            for (int j = 0; j < cats.size(); j++) {
//                Object b = cats.toArray()[j];
//                count++;
//                if (true != (a.equals(b))) {
//                    pets2.add(a);
//                    cc++;
//                }
////                else
////                    System.out.println(a);
//            }
//        }
//        pets.clear();
//        pets = pets2;
//        System.out.println("счетчик " + count);
//        System.out.println("счетчик_2 " + cc);
//        for (Object ol : pets2) {
//            System.out.println(ol);
//        }

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object ob : pets) {
            System.out.println(ob);

        }
//        System.out.println("\n");
    }

    //напишите тут ваш код
    public static class Cat {
    }
    public static class Dog  {
    }

}

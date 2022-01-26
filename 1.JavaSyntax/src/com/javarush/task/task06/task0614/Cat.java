package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }


    public static void main(String[] args) {
        //напишите тут ваш код

        Cat a1 = new Cat();
        cats.add(a1);
        Cat a2 = new Cat();
        cats.add(a2);
        Cat a3 = new Cat();
        cats.add(a3);
        Cat a4 = new Cat();
        cats.add(a4);
        Cat a5 = new Cat();
        cats.add(a5);
        Cat a6 = new Cat();
        cats.add(a6);
        Cat a7 = new Cat();
        cats.add(a7);
        Cat a8 = new Cat();
        cats.add(a8);
        Cat a9 = new Cat();
        cats.add(a9);
        Cat a10 = new Cat();
        cats.add(a10);

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for(int i = 0; i< cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}

package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> children123 = new ArrayList<Human>();
        ArrayList<Human> otech = new ArrayList<Human>();
        ArrayList<Human> mat = new ArrayList<Human>();

        Human child1 = new Human("Ребенок1", true, 5);
        Human child2 = new Human("Ребенок2", false, 8);
        Human child3 = new Human("Ребенок3", true, 2);

        children123.add(child1);
        children123.add(child2);
        children123.add(child3);

        Human man = new Human("Отец", true, 30, children123);
        Human woman = new Human("Мать", false, 26, children123);

        otech.add(man);
        mat.add(woman);

        Human ded1 = new Human("Дед1", true, 80, otech);
        Human ded2 = new Human("Дед2", true, 76, mat);
        Human babka1 = new Human("Бабка1", false, 79, otech);
        Human babka2 = new Human("Бабка2", false, 77, mat);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        System.out.println(man.toString());
        System.out.println(woman.toString());

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String  name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String  name, boolean sex, int age) {  // конструктор для класса Human
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String  name, boolean sex, int age, ArrayList<Human> children) {
            this (name, sex, age);         //вызываем предыдущий конструктор с тремя параметрами
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

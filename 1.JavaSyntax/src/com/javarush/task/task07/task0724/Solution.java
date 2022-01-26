package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        Human ded1 = new Human("Дед1", true, 80);
        Human ded2 = new Human("Дед2", true, 78);
        Human bab1 = new Human("Бабка1", false, 85);
        Human bab2 = new Human("Бабка2", false, 60);

        Human man1 = new Human("Папа1", true, 30, ded1, bab1);
        Human woman1 = new Human("Мама1", false, 28, ded2, bab2);
        Human childm1 = new Human("Сын1", true, 5, man1, woman1);
        Human daughter1 = new Human("Дочь1", false, 8, man1, woman1);
        Human daughter2 = new Human("Дочь2", false, 2, man1, woman1);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(man1.toString());
        System.out.println(woman1.toString());
        System.out.println(childm1.toString());
        System.out.println(daughter1.toString());
        System.out.println(daughter2.toString());


    }

    public static class Human {
        // напишите тут ваш код
       private String  name;
       private boolean sex;
       private int age;
       private Human father, mother;

        public Human (String  name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String  name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Миха", 30, "Москва");
        Man man2 = new Man("Миха", 30, "Москва");
        Woman woman1 = new Woman("Нина", 26, "Казань");
        Woman woman2 = new Woman("Нина", 26, "Казань");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man    {
        private String name, address;
        private int age;

            public Man() {
                this.name = null;
                this.address = null;
                this.age = 0;
            }

            public Man(String name) {
                this.name = name;
                this.address = null;
                this.age = 0;
            }

            public Man(String name, String address) {
                this.name = name;
                this.address = address;
                this.age = 0;
            }

            public Man(String name, int age, String address) {
                this.name = name;
                this.address = address;
                this.age = age;
            }

    }



    public static class Woman{
        private String name, address;
        private int age;

            public Woman() {
                this.name = null;
                this.address = null;
                this.age = 0;
            }

            public Woman(String name) {
                this.name = name;
                this.address = null;
                this.age = 0;
            }

            public Woman(String name, String address) {
                this.name = name;
                this.address = address;
                this.age = 0;
            }

            public Woman(String name, int age, String address) {
                this.name = name;
                this.address = address;
                this.age = age;
            }
    }

    //напишите тут ваш код
}

package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person(); // создаем объект типа Person и присваеваем его ссылку на переменную person
        person.initialize("Piter", 25); // инициализируем
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;
        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
}

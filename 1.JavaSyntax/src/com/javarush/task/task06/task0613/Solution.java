package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat a1 = new Cat();
        Cat a2 = new Cat();
        Cat a3 = new Cat();
        Cat a4 = new Cat();
        Cat a5 = new Cat();
        Cat a6 = new Cat();
        Cat a7 = new Cat();
        Cat a8 = new Cat();
        Cat a9 = new Cat();
        Cat a10 = new Cat();

        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount;

        // Создай конструктор
        public  Cat() {
            Cat.catCount++;
        }
    }
}

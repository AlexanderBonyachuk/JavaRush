package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int a = Integer.compare(this.age, anotherCat.age);
        int b = Integer.compare(this.weight, anotherCat.weight);
        int c = Integer.compare(this.strength, anotherCat.strength);
        int score = a+b+c;

        return score>0;
    }

    public static void main(String[] args) {

    }
}

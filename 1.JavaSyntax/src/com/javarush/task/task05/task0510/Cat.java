package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name = null, address = null, color;
    private int age, weight;

    public void initialize(String name) {
        this.name = name;

        this.color = "black";
        this.age = 5;
        this.weight = 10;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;

        this.color = "black";
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;

        this.color = "black";
        this.age = age;
        this.weight = 10;
    }

    public void initialize(int weight, String color) {


        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {

        this.address = address;
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}

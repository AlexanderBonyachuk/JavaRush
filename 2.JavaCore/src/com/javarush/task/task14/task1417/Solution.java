package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<>();
            //напишите тут ваш код
            allMoney.add(new Hryvnia(1560));
            allMoney.add(new Ruble(11000));
            allMoney.add(new USD(10));
        }

        private final List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

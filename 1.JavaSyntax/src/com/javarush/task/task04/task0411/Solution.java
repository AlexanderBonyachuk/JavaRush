package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);

//        checkSeason(2);
//        checkSeason(5);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (0<month && month<=2 || month == 12) {System.out.println("зима");}
        if (2<month && month<=5) {System.out.println("весна");}
        if (5<month && month<=8) {System.out.println("лето");}
        if (8<month && month<=11) {System.out.println("осень");}

    }
}
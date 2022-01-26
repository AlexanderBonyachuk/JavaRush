package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,1.2));
        System.out.println(convertEurToUsd(122,1.19));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur*exchangeRate;

    }
}

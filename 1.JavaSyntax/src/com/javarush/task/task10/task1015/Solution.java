package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        String s = "Ну, тип строка)";
        ArrayList<String>[] aa1 = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            ArrayList<String > a1 = new ArrayList<>();
            a1.add(s+i);
            aa1[i] = a1;
        }
        return aa1;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
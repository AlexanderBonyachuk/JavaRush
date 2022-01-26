package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);


        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
//        System.out.println("размер массива " + strings.size());

        for (int i=0; i<strings.size(); i++) {

//            System.out.println("цикл номер " + i + ", текущее слово " + strings.get(i));

            int indexL = strings.get(i).indexOf("л");
            int indexR = strings.get(i).indexOf("р");

            if ((indexR != -1) && (indexL == -1)) {
                strings.remove(i);
                i--;
//                System.out.println("удалил сово с Р ");
            }

            if ((indexL != -1) && (indexR == -1)) {
                strings.add(i + 1, strings.get(i));
                i++;
//                System.out.println("удвоил сово с Л ");
            }

//            System.out.println("значение " + i + "размер массива " + strings.size());
//            else
//                i++;
        }

        return strings;
    }
}
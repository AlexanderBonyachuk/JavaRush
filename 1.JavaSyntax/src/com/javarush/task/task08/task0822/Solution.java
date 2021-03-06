package com.javarush.task.task08.task0822;

import javafx.beans.binding.When;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
//            System.out.println("сравнение");
            if (min > array.get(i))
                min = array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> list = new ArrayList<>();
        BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reder.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reder.readLine());
            list.add(num);
        }
        return list;
    }
}

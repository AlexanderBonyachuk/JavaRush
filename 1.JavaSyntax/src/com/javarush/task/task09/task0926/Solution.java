package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> spisok = new ArrayList<>();
        int[] array1 = {5,4,3,2,1};
        int[] array2 = {2,1};
        int[] array3 = {4,3,2,1};
        int[] array4 = {7,6,5,4,3,2,1};
        int[] array5 = new int[0];
        spisok.add(array1);
        spisok.add(array2);
        spisok.add(array3);
        spisok.add(array4);
        spisok.add(array5);
//        System.out.println("Длина массива " + spisok.size());
        return spisok;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(n.readLine()));

            if (list.get(i) % 3 == 0)
                list1.add(list.get(i));
            if (list.get(i) % 2 == 0)
                list2.add(list.get(i));
            if ((list.get(i) % 3 != 0) && (list.get(i) % 2 != 0))
                list3.add(list.get(i));
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}

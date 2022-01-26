package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listA = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(reader.readLine());
            listA.add(a);
        }
        int sequence1 = 0;

        for (int i = 0; i < 10; i++) {

            int sequence2 = 0;

            for (int j = 0; j < 10-i; j++) {

                    if (listA.get(i).equals(listA.get(i + j))) {  // пока не поставил equals числа больше 127 не сравнивались, странно
                        sequence2++;
                        if (sequence2 > sequence1)
                            sequence1 = sequence2;
                    }
                    else break;
            }

        }
        System.out.println(sequence1);

    }
}
package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) { // чтение массива
            String a = reader.readLine();
            list.add(a);
        }

        for (int i = 0; i < m; i++) {
            list.add((list.size()-1),list.remove(0)); // перемещение первой строки в конец списка
        }

        for (String x : list) {
            System.out.println(x); // вывод на экран
        }

        //напишите тут ваш код
    }
}

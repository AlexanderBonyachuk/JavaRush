package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData()  {
        //напишите тут ваш код
        ArrayList<Integer> chisla = new ArrayList<>();
        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                chisla.add(a);
            }
        }
        catch (Exception e) {
            for (int num : chisla)
                System.out.println(num);
//            throw new Exception();
        }
    }
}

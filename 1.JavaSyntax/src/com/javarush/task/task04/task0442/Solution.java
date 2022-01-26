package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));

        int s=0;


        while (true) {
            int a = Integer.parseInt(number.readLine());
            s +=a;

            if (a == -1) {
                System.out.println(s);
                break;
            }
        }

    }
}

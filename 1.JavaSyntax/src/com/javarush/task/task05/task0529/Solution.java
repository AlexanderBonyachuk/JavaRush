package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int summ=0;

        while (true) {
            String s = number.readLine();
            if (s.equals("сумма"))
                break;
            int n = Integer.parseInt(s);
            summ += n;
        }

        System.out.println(summ);
    }
}

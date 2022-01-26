package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        float a =0, summ=0;
        float srar=0;

        for (int i=0; a!=-1; a = Float.parseFloat(number.readLine())) {
            summ += a;
            srar = summ / i;
//            System.out.println(summ + "       " + srar + "      " + i);
            i++;
        }

//        System.out.printf("Вывод: "+"%.1f\n", srar);
        System.out.println(srar);
    }
}


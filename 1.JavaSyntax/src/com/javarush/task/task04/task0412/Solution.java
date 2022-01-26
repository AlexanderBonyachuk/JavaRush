package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(number.readLine());
        if (c > 0)
            System.out.println(c *= 2);
        else
            if (c < 0) {
                System.out.println(c += 1);}
            else {
                System.out.println(c);}



    }

}
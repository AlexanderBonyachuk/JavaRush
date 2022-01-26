package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(c.readLine());

        int razrad;
        even=0;
        odd = 0;

        if (n>=10) {
            if ((abs(n)) % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            for (int i = 10; (abs(n)) >= i; i *= 10) {
                razrad = (abs(n)) / i;
                if (razrad % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        else {
                if ((abs(n)) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
        }


        System.out.println("Even: " + even + " Odd: " + odd);

    }
}

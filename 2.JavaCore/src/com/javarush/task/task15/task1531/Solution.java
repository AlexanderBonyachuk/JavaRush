package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        int factorial = 1;
        String str = "";
        if (n > 0) {
            BigInteger f = BigInteger.valueOf(factorial);//приведение int к BigInteger
            for (int i = 1; i <= n; i++) {
                BigInteger i1 = BigInteger.valueOf(i);
                f = f.multiply(i1);
            }
            str = String.valueOf(f);
        }
        if (n < 0) {
            factorial = 0;
            str = String.valueOf(factorial);
        }
        if (n == 0) { str = String.valueOf(factorial); }

        return str;
    }
}

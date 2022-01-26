package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        reader.close();

        int param = url.indexOf('?');
        String utl2 = url.substring(++param);

        char[] simvols = utl2.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        String strWord = "";
        int sj = 0;
        int leng = simvols.length;

        for (int i = 0; i < simvols.length; i++) {
            if ((simvols[i] == '&')) {
                words.add(strWord);
                strWord = "";
            } else { strWord = strWord + simvols[i]; }
        }
        words.add(strWord);

        for (String str: words) {
            String str2 = str;
            if (str.contains("=")) {
                param = str.indexOf('=');
                str2 = str.substring(0, param);
                String strValue = str.substring(++param);
            }
            System.out.print(str2 + " ");
        }

        System.out.println();

        for (String str: words) {
            String str2 = str;
            if (str.contains("=")) {
                param = str.indexOf('=');
                str2 = str.substring(0, param);
                String strValue = str.substring(++param);
                if (str2.equals("obj")) {
                    try {
                        double value = Double.parseDouble(strValue);
                        alert(value);
                    } catch (NumberFormatException e) {
                        alert(strValue);
                    }
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

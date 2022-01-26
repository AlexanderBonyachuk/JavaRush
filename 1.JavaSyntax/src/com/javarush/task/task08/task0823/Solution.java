package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String sCoppy = "0";   // копированаяна строка, в котрую будем записывать преобразованную исходную строку

        for (int i = 1; i < string.length(); i++) {

            if (i-1 == 0) {                               // условие для первого символа в строке
                String si = string.substring(i - 1, i);   // выбираю из строчки 1й символ
                String si2 = string.substring(i, i + 1);  // выбираю из строчки 2й символ
                si = si.toUpperCase();
                sCoppy = si;
                if (si.equals(" ")) {             // если первый символ пробел, то 2й будет большими буквами
                    si2 = si2.toUpperCase();
                    sCoppy += si2;
                }
                else                        // иначе просто присваиваем второй символ
                    sCoppy += si2;
            }
            else {                         // это условие для всех символов начиная с третьего по счету
                String si = string.substring(i - 1, i);
                String si2 = string.substring(i, i + 1);

                if (si.equals(" ")) {
                    si2 = si2.toUpperCase();
                    sCoppy = sCoppy + si2;
                }
                else {
                    sCoppy = sCoppy + si2;
                }
            }
        }
        System.out.println(sCoppy);
    }
}

package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        int[] kolvo = new int[33];                          // делаем массив чисел на 33 позиции
        for (int i = 0; i < 33; i++) {
            kolvo[i] = 0;                                   // забиваем массив нулями
        }

        for (String stroka : list) {                       // читаем Лист по строчкам 10 раз
            for (int i = 0; i < stroka.length(); i++) {
                char simV = stroka.charAt(i);               // перебираем стрики по символьно
                int nomerValfav = 0;
                for (char simvol : alphabet) {
                    if (simvol == simV) {
                        ++kolvo[nomerValfav];    // если выбранный символ из слова совпадает с символом в алфавите, то++
                    }
                    else {
                        nomerValfav++;  // иначе номер в алфавите ++
                    }
                }
            }
        }

        int numberBukv = 0;
        for (char bukva : alphabet) {               // вывод
            System.out.print(bukva + " " + kolvo[numberBukv]);
            System.out.println();
            numberBukv++;
        }
    }
}

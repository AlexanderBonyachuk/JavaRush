package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        String s = red.readLine();
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character > a2 = new ArrayList<>();
        char[] chars1 = s.toCharArray();  // преобразовали строку с массив символов

        for (char sim : chars1) {
            if (sim != ' ') {
                if (isVowel(sim)) {
                    a1.add(sim);
                    a1.add(' ');
                } else {
                    a2.add(sim);
                    a2.add(' ');
                }
            }
        }

        for (char cc : a1) {
            System.out.print(cc);
        }
        System.out.println();
        for (char cc : a2) {
            System.out.print(cc);
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите значение: ");  // это закоментить
        while (true) {
//            System.out.println("Введите значение: ");  // это закоментить
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> letters = new ArrayList<>();   // массив для букв
        ArrayList<Integer> numbers = new ArrayList<>();   // массив для цифр

        for (String ar : array) {               // распределяем числа и буквы по массивам
            boolean isNum = isNumber(ar);
            if (isNum) {
                int vremenn = Integer.parseInt(ar);
                numbers.add(vremenn);
            }
            else
                letters.add(ar);
        }

        for (int i = 1; i < numbers.size(); i++) {                        // Челночнаыя сортировка (Shuttle Sort)
            if ((numbers.get(i - 1) < numbers.get(i))) {      // числа
                int vrem = numbers.get(i - 1);
                numbers.set((i-1), numbers.get(i));
                numbers.set((i), vrem);
                for (int z = i-1; (z-1) >= 0; z--) {
                    if ((numbers.get(z - 1) < numbers.get(z))) {
                        int vrem2 = numbers.get(z - 1);
                        numbers.set((z-1), numbers.get(z));
                        numbers.set((z), vrem2);
                    }
                    else {
                        break;
                    }
                }
            }
        }         // конец челночной сортировки

        for (int i = 1; i < letters.size(); i++) {                        // Челночнаыя сортировка (Shuttle Sort)
            if (isGreaterThan(letters.get(i - 1), letters.get(i))) {      // слова
                String vrem = letters.get(i - 1);
                letters.set((i-1), letters.get(i));
                letters.set((i), vrem);
                for (int z = i-1; (z-1) >= 0; z--) {
                    if (isGreaterThan(letters.get(z - 1), letters.get(z))) {
                        String vrem2 = letters.get(z - 1);
                        letters.set((z-1), letters.get(z));
                        letters.set((z), vrem2);
                    }
                    else {
                        break;
                    }
                }
            }
        }         // конец челночной сортировки

        int n1 = 0, l1 = 0;
        for (int i = 0; i < array.length; i++) {               // расставляем слова и числа по своим местам, согласно изначальной записи
            boolean isNum = isNumber(array[i]);
            if (isNum) {
                array[i] = numbers.get(n1).toString();
                n1++;
            }
            else {
                array[i] = letters.get(l1);
                l1++;
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }
        return true;
    }
}

package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();
//        String nameFile = "D:\\world\\texst world, world-world";
        FileReader fileReader = new FileReader(nameFile);
        BufferedReader readerFile = new BufferedReader(fileReader);
        String line = readerFile.readLine();

        int numWord = 0;

        while (line != null) {
            String[] masWord = line.split("\\W"); //Все символы кроме букв и цифр
            for (String wordMas: masWord) {
                if (wordMas.equals("world"))
                    ++numWord;
            }
            line = readerFile.readLine();
        }

        fileReader.close();

        System.out.println(numWord);
    }
}

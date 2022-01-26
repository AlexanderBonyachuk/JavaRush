package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way1 = reader.readLine();
        String way2 = reader.readLine();
        reader.close();

         try (FileReader fileReader = new FileReader(way1)) {
             try (FileWriter fileWriter = new FileWriter(way2)) {
                 boolean writeIn = false;
                 while (fileReader.ready()) { //пока есть непрочитанные байты в потоке ввода
                     int data = fileReader.read(); //читаем символ (char будет расширен до int)
                     if (writeIn) {
                         fileWriter.write(data);
                         writeIn = false;
                     } else { writeIn = true; }
                 }
             }
         }


    }
}

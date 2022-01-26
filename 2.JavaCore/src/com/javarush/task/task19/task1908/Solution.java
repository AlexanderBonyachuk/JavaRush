package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way1 = reader.readLine();
        String way2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(way1);
        try (BufferedWriter bR = new BufferedWriter(new FileWriter(way2))) {
                ArrayList<Integer> listNumbers = new ArrayList<>();

                BufferedReader readerFile = new BufferedReader(fileReader);
                String line = readerFile.readLine();
                while (line != null) {
                    String[] masWords = line.split(" ");
                    for (String s : masWords) {
                        try {
                            listNumbers.add(Integer.parseInt(s));
                        } catch (NumberFormatException e) {
//                            System.err.println("Ошибочка вышла");
                        }
                    }
                    line = readerFile.readLine();
                }
                readerFile.close();

            String stroka;
            for (int num: listNumbers) {
                stroka = num + " ";
                bR.write(stroka);
//                System.out.println(stroka);
        }

        }
        catch (Exception e) { }
        fileReader.close();


    }
}

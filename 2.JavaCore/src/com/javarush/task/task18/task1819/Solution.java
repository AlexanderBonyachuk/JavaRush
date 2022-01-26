package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (
//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//             FileInputStream fileInputStream2 = new FileInputStream(file2);
//             FileInputStream fileInputStream1 = new FileInputStream(file1);
//             FileOutputStream fileOutputStream = new FileOutputStream(file1);
                FileReader fileReader1 = new FileReader(file1);
                FileReader fileReader2 = new FileReader(file2);
                FileWriter fileWriter1 = new FileWriter(file1);

        ) {
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            while (fileReader1.ready()) {
                list2.add(fileReader1.read());
            }
            while (fileReader2.ready()) {
                list1.add(fileReader2.read());
            }
            for (int i = 0; i < list2.size(); i++) {
                list1.add(list2.get(i));
            }
            for (int i = 0; i < list1.size(); i++) {
                fileWriter1.write(list1.get(i));
            }

//            while (fileInputStream2.available() > 0) {
//                byteArrayOutputStream.write(fileInputStream2.read());
//            }
//            while (fileInputStream1.available() > 0) {
//                byteArrayOutputStream.write(fileInputStream1.read());
//            }
//            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}

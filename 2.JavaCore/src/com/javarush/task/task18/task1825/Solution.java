package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     ArrayList<String> listFiles = new ArrayList<>();
     String nameFile = reader.readLine();
     String location = nameFile.substring(0, nameFile.lastIndexOf('.'));
     while (!nameFile.equals("end")) {
         listFiles.add(nameFile);
         nameFile = reader.readLine();
     }
    Collections.sort(listFiles); // сортировка списка файлов с нчала до конца

     System.out.println(location);
     try (
        FileOutputStream out = new FileOutputStream(location); // создание нового файла
        ){
            for (String nameFileI : listFiles) {
//                nameFileI = nameFileI.substring(0, nameFileI.lastIndexOf('.')); // думал сканировать надо с чистых файлов
                FileInputStream n1 = new FileInputStream(nameFileI);
                byte[] buffer = new byte[n1.available()];
                n1.read(buffer);
                out.write(buffer);
                n1.close();
//                while (n1.available() > 0) {  // записываем по порядку файлы в новенький файл
//                    out.write(n1.read());  // чтение без буфера
//                }
            }
//            out.close();
        }
    }
}

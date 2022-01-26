package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        List<Integer> list = new ArrayList<>();

         try (FileInputStream inputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2)) {
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
             for (int i = list.size()-1; i >= 0; --i) {
                 fileOutputStream.write(list.get(i));
             }
         }
    }
}

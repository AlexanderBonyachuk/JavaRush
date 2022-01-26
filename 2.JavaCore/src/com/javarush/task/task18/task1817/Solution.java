package com.javarush.task.task18.task1817;

import java.io.*;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        args = new String[] {"D:\\texst\\out.txt"};
        File file = new File(args[0]);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];
        fileInputStream.read(byteArray);
        String data = new String(byteArray);
//        System.out.println(data);
        float numCharacter = data.length();
        float numSpace = data.length() - data.replace(" ", "").length();
        float num = 100*numSpace/numCharacter;
        fileInputStream.close();
        System.out.printf("%.2f", num);
    }
}

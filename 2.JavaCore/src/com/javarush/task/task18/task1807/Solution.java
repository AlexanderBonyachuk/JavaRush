package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        char sim;
        int numComma = 0, i;
        while ((i = bufferedInputStream.read()) != - 1) {
            sim = (char)i;
            if (sim == ',') ++numComma;
        }
        System.out.println(numComma);
//        bufferedInputStream.close();
        inputStream.close();
    }
}

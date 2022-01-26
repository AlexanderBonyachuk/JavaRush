package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int data = 0;
        while (inputStream.available() > 0) {
            data = inputStream.read();
            int data2 = inputStream.read();
            if (data2 < data) {
                data = data2;
            }
        }
        inputStream.close();
        System.out.println(data);
    }
}

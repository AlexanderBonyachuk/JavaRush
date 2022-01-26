package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int data = 0, data2;
        while (inputStream.available() > 0) {
            data2 = inputStream.read();
//            System.out.println("data2: " + data2);
            if (data2 > data) {
                data = data2;
            }
        }
        inputStream.close();
        System.out.println(data);
    }
}

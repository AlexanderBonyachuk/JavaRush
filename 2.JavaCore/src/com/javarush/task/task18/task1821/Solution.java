package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;


/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"D:\\texst\\out2.txt"};
        int[] asii = new int[128];
        try ( FileInputStream inputStream = new FileInputStream(args[0]) ) {
            while (inputStream.available() > 0) {
                asii[inputStream.read()]++;
            }
        }
        for (int i = 0; i < asii.length; i++) {
            if (asii[i] != 0)
                System.out.println((char)i + " " + asii[i]);
        }
    }
}

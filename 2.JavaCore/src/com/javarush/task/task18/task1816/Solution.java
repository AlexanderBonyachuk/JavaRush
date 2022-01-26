package com.javarush.task.task18.task1816;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
//        String mode = "D:\\texst\\out.txt";
//        try (FileInputStream fileInputStream = new FileInputStream(mode);
//             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF8"))) {
//            String str;
//            int counter = 0;
//            while ((str = reader.readLine()) != null) {
//                System.out.println(str);
//                if (str.contains()) {}
//            }
//    }
        int counter = 0;
        char[] arr = new char[]{'A', 'E', 'I', 'O', 'U', 'Y', 'B', 'C', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'}; // мне не нравится пролиска массива символов, надо через регулярки сделать
//        char[] rrr = new char[]{'d', 'D'};
//        System.out.println(rrr[0] + " " + rrr[1]);
//        System.out.println((byte) rrr[0] + " " + (byte) Character.toLowerCase(rrr[1]));

        try (FileInputStream fileInputStream = new FileInputStream(mode)) {
            while (fileInputStream.available() > 0) {
                byte bit = (byte) fileInputStream.read();
                for (char ch: arr) {
                    if (bit == (byte)ch || bit == (byte)Character.toLowerCase(ch)) ++counter;
                }
            }
        }
        System.out.println(counter);

    }
}

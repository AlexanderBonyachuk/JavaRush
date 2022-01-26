package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                } else fileOutputStream2.write(fileInputStream.read());
            }
        }
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String strFile = bufferedReader.readLine();
//        FileInputStream inputStream = new FileInputStream(strFile);
//        File file = new File(strFile);
//
//        FileOutputStream fileOutputStream1 = new FileOutputStream(bufferedReader.readLine());
//        FileOutputStream fileOutputStream2 = new FileOutputStream(bufferedReader.readLine());
////        long lf = (long) (file.length() - file.length() / 2);
//        int lf = (inputStream.available() +1) / 2;
////        lf++;
//        while (inputStream.available() > 0) {
//            if (lf > -1) {
//                fileOutputStream1.write(inputStream.read());
//                --lf;
//            } else {
//                fileOutputStream2.write(inputStream.read());
//            }
//        }
//        inputStream.close();
//        fileOutputStream1.close();
//        fileOutputStream2.close();
    }
}

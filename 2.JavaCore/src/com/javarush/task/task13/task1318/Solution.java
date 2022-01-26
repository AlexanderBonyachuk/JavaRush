package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        FileInputStream inStream = null;
        InputStreamReader inputSrteam = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFileRead = reader.readLine();
            reader.close();

            inStream = new FileInputStream(nameFileRead);
            inputSrteam = new InputStreamReader(inStream, "UTF-8");

            char[] fileChars = new char[inStream.available()];
            int b = 0;
//        while (inStream.read() != -1) {  //  одно и тоже, сто и:
            while ((b = inputSrteam.read()) != -1) {
                System.out.print((char) b);
            }
            inStream.close();
            inputSrteam.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inStream.close();
            }  catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputSrteam.close();
            }  catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
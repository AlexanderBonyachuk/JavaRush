package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
//        try {
            while (inputStream.available() >= 1000) {
                System.out.println(inputStream.available());
                file = reader.readLine();
                inputStream = new FileInputStream(file);
            }
        inputStream.close();
            throw new DownloadException();

//        } catch (DownloadException e) {
//            throw new DownloadException();
//        }
    }

    public static class DownloadException extends Exception {

    }
}

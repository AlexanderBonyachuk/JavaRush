package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


//            System.out.println("Читаем первый раз");
            String sourceFileName = reader.readLine();
            InputStream fileInputStream = null;
        try {
            fileInputStream = getInputStream(sourceFileName);
        }
        catch (FileNotFoundException  e) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

//        System.out.println("Читаем sourceFileName (2): ");
//         sourceFileName = reader.readLine();
        System.out.println("Читаем destinationFileName (3): ");
        String destinationFileName = reader.readLine();

         fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}


package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

// JavaRush плагин запустился, но проверить не смог мое решение
// прога не переваривает латиницу - выдает ошибку

public class Solution {
    public static volatile Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        while (!word.equals("exit")) {
            ReadThread threadRead = new ReadThread(word);
            threadRead.start();
            word = reader.readLine();
        }
//        System.out.println("Подождем n сек"); // проверка
//        Thread.sleep(10000);
//        for (Map.Entry<String, Integer> pair: resultMap.entrySet()) {
//            System.out.println(pair.getKey() + " | " + (char) Byte.parseByte(String.valueOf(pair.getValue())) + " | ");
//        }
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName)  {
            //implement constructor body
            super(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                try (FileInputStream fIStr = new FileInputStream(currentThread().getName());
                ) {
                    int[] mass = new int[256];
                    int maxByte = 0;
                    while (fIStr.available() > 0) {
                        int i = fIStr.read();
//                        System.out.println("Читаем: " + (char)i); // проверка
                        mass[i]++;
                        if (mass[i] > mass[maxByte]) {
//                            System.out.println((char) i + " " + (char) maxByte); // проверка
                            maxByte = i;
                        }
                    }
//                    System.out.println("Частый байт: " +  maxByte + " это символ: " + (char)maxByte + " Число его повторов:  " + mass[maxByte]); // проверка
                    String str = currentThread().getName();
                    String name = str.substring(1+str.lastIndexOf("\\"));
                    resultMap.put(name, maxByte);
                }
            }
             catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                Thread.currentThread().interrupt();
            }
        }
    }
}

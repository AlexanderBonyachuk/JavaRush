package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int id = Integer.parseInt(reader.readLine());
//        String nameFile = "D:\\texst\\out.txt";
        String nameFile = reader.readLine();
//        args = new String[]{"-05"};

        try ( // Построчное считывание
             BufferedReader bR = new BufferedReader(new FileReader(nameFile));
             ) {
                String line = bR.readLine();
                ArrayList<String> listData = new ArrayList<>();
                while (line != null) {
//                    listData.add(line);  // заполняем файл в массив
                    if (line.startsWith(args[0] + " ")) {
                        System.out.println(line);
                    }
                    line = bR.readLine();
                }
//            for (String str: listData) {
//                if (str.startsWith(args[0])) {
//                    System.out.println(str);
//                }
//                if (Integer.parseInt(str.substring(0, str.indexOf(" "))) == id) {
//                    System.out.println(str);
//                }
//            }
        }
    }
}

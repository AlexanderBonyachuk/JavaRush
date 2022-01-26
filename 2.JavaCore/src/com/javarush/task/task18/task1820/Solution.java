package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();

        try (FileReader fR = new FileReader(new File(nameFile1));
             BufferedReader bR = new BufferedReader(fR);
             PrintWriter out = new PrintWriter(new FileOutputStream(nameFile2));
        ) {
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Double> listD = new ArrayList<>();

            String line = bR.readLine(); // посторочное чтение файла
            while (line != null) {
                list.add(line);
                String[] num = line.split(" ");
                for (String n : num) {
                    double nuD = Double.parseDouble(n);
                    listD.add(Double.parseDouble(n));
                }
                for (Double d : listD) {
//                        out.printf("%.0f", d); // Это запись в определенном формате
                    out.printf(String.valueOf(Math.round(d)));
                    out.printf(" ");
                }
                out.printf("\n"); // переход на новую сточку
                listD.clear(); // очистка массива от уже записанных чисел, чтобы по второму разу не писались
                line = bR.readLine();
            }

//            for (String words: list) { // раздеделение строки на чиста по пробелу
//                String[] num = words.split(" ");
//                for (String n: num) {
//                    listF.add(Double.parseDouble(n));
//                }

//            int symbol = bR.read(); // посимвольное чтение файла
//            while (symbol != -1) {
//                // преобразования
//                if ((char)symbol != ' ')
//
//                symbol = bR.read();
//            }

//        String s1 = "15.0168 0.0015 2.1 0.0 6.563";
//        String[] num = s1.split(" ");
//        ArrayList<Float> listFloat = new ArrayList<>();
//        for (String n: num) {
//            listFloat.add(Float.parseFloat(n));
//        }
//        for (Float n1: listFloat) {
//            System.out.println(n1);
//        }

//        double value = 34.50;
//        double result = Math.floor(value);
//        System.out.println( (int)result);
        }
    }
}

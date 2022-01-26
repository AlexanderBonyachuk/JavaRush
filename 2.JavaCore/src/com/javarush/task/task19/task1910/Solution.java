package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way1 = reader.readLine();
        String way2 = reader.readLine();
        reader.close();
        try (BufferedReader bR = new BufferedReader(new FileReader(way1))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(way2))) {
                String line = bR.readLine();
                String line1;
                while (line != null) {
                    line1 = line.replaceAll("[\\p{Punct}\\s&&[^\\h]]", "");
                    bufferedWriter.write(line1 + "\n");
                    line = bR.readLine();
                }
            }
        }
    }
}

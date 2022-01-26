package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFileRead = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(nameFileRead));

            while (true) {
                String stroka = reader.readLine();
                writer.write(stroka + "\n");
                if (stroka.equals("exit")) {
                    reader.close();
                    writer.close();
                    break;
                }
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}

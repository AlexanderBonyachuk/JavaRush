package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = "";
        try {
            while (true) {
                nameFile = reader.readLine();
                try (FileReader fileReader = new FileReader(nameFile)) {}
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(nameFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

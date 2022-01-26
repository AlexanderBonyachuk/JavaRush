package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String s = n.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(n.readLine());
        return s;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        double s = Double.parseDouble(n.readLine());
        return s;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        boolean s = Boolean.parseBoolean(n.readLine());
        return s;
    }

    public static void main(String[] args) throws Exception {

    }
}

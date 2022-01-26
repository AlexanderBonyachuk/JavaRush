package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String parametr = reader.readLine();
        if (parametr.equals("helicopter")) {
            result = new Helicopter();
        }
        if (parametr.equals("plane")) {
            int passengers = Integer.parseInt(reader.readLine());
            result = new Plane(passengers);
        }
        reader.close();
        //add your code here - добавьте код тут
    }
}

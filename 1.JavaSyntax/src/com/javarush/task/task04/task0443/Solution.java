package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        String n = name.readLine();
        int y = Integer.parseInt(name.readLine());
        int m = Integer.parseInt(name.readLine());
        int d = Integer.parseInt(name.readLine());

        System.out.println("Меня зовут " + n + ".\nЯ родился " + d + "." + m + "." + y);
    }
}

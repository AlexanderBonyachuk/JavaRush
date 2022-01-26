package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        String a = name.readLine();
        String b = name.readLine();


//        System.out.println(a + "\t" + b);

//        public boolean equals(a) {
//            return this.a == a;
//        }

        if (a.equals(b))
            System.out.println("Имена идентичны");
        else {
            if (a.length() == b.length())
                System.out.println("Длины имен равны");
        }
        System.out.println(a.length() + b.length());

    }
}

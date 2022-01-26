package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; ++i) {
            list.add(n.readLine());
        }

        int min = list.get(0).length();
        int max = list.get(0).length();
        int amin = 0, bmax = 0;


        for (int i=1; i<10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                amin = i;
            }

            if (list.get(i).length() > max) {
                max = list.get(i).length();
                bmax = i;
            }
        }

        if (amin < bmax)
            System.out.println( list.get(amin) );
        else
            System.out.println( list.get(bmax) );


    }
}

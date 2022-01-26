package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        inputStream.close();
        TreeSet<Integer> listBits = new TreeSet<>();
        int minRepit = 0;
        int repit;
        for (int bit: list) {
            if (minRepit == 0) {
                minRepit = Collections.frequency(list, bit);
            }
            repit = Collections.frequency(list, bit);
             if (repit <= minRepit) {
                 if (repit < minRepit) {
                     minRepit = repit;
                     listBits.clear();
                     listBits.add(bit);
                 }
                 listBits.add(bit);
             }
        }
        for (int b: listBits) {
            System.out.print(b + " ");
        }
    }
}

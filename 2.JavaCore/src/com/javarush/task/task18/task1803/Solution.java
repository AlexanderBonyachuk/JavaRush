package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        inputStream.close();

//        for (int b: list) {
//            System.out.print(b + " ");
//        }
//        System.out.println();

        TreeSet<Integer> listBitRepit = new TreeSet<>();
        int maxRepit = 0, repit;
        for (int bit: list) {
            if (maxRepit == 0) {
                maxRepit = Collections.frequency(list, bit);
            }
            repit = Collections.frequency(list, bit);
            if (repit >= maxRepit) {
                if (repit > maxRepit) {
                    maxRepit = repit;
                    listBitRepit.clear();
                    listBitRepit.add(bit);
                } else {
                    listBitRepit.add(bit);
                }
            }
        }
        for (int b: listBitRepit) {
            System.out.print(b + " ");
        }
    }
}

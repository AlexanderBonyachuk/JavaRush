package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String  a = reader.readLine();
            String  b = reader.readLine();
            int num1 = 0;
            int num2 = 0;

            num1 = Integer.parseInt(a);
            if (num1 <= 0 )
                throw new Exception();
            num2 = Integer.parseInt(b);
            if (num2 <= 0 )
                throw new Exception();
            ArrayList<Integer> del1 = new ArrayList<>();
            ArrayList<Integer> del2 = new ArrayList<>();
            int delitel = 2;
            int nod = 1;
            int numS1 = num1;
            int numS2 = num2;
            while (true) {

                if (delitel > numS1){
                    break;
                }
                if (numS1 % delitel == 0) {
                    numS1 = numS1 / delitel;
                    del1.add(delitel);
                } else {
                    delitel++;
                }
            }
            delitel = 2;
            while (true) {

                if (delitel > numS2){
                    break;
                }
                if (numS2 % delitel == 0) {
                    numS2 = numS2 / delitel;
                    del2.add(delitel);
                } else {
                    delitel++;
                }
            }

            if (del1.size() >= del2.size()) {
                for (int deliel2 : del2) {
                    for (int deliel1 : del1) {
                        int tek1 = deliel1;
                        int tek2 = deliel2;
//                        System.out.println(tek1 + " " + tek2);
                        if (tek1 == tek2) {
                            nod = nod * tek1;
                            break;
                        }
                        if (tek2 == num2)
                            break;
                    }
                }
            } else {
                for (int deliel1 : del1) {
                    for (int deliel2 : del2) {
                        int tek1 = deliel1;
                        int tek2 = deliel2;
//                        System.out.println("tek1  " + tek1 + " " + " /tek2  " + tek2);
                        if (tek1 == tek2) {
                            nod = nod * tek1;
                            break;
                        }
                        if (tek1 == num1)
                            break;
                    }
                }
            }
            System.out.println(nod);
    }
}

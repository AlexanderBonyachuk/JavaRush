package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader aa = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(aa.readLine());
//        System.out.println();
//        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
//        int b = Integer.parseInt(bb.readLine());
//        BufferedReader cc = new BufferedReader(new InputStreamReader(System.in));
//        int c = Integer.parseInt(cc.readLine());
//        System.out.println("Введите a ");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите a ");
        int a = sc.nextInt();
//        System.out.println("Введите b ");
        int b = sc.nextInt();
//        System.out.println("Введите c ");
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.print(a + " " + b + " " + c);
        else {
            if (a == b)
                System.out.print(a + " " + b);
            if (a == c)
                System.out.print(a + " " + c);
            if (b == c)
                System.out.print(b + " " + c);
        }

//        else
//            System.out.println("");


    }
}
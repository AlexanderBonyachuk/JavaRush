package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");

    }
}

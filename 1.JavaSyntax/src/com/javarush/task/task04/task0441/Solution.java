package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());


        if ((a>b && a<c) || (a>c && a<b))
            System.out.println(a);

        if ((b>a && b<c) || (b>c && b<a))
            System.out.println(b);

        if ((c>a && c<b) || (c>b && c<a))
            System.out.println(c);

        if ((a==b) && (b==c))
            System.out.println(b);
        else {

            if (a == b)
                System.out.println(b);

            if (c == b)
                System.out.println(b);

            if (a == c)
                System.out.println(c);
        }


    }
}

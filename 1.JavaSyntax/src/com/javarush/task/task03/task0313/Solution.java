package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s[] =  new String[3];
        s[0]="Мама";
        s[1]="Мыла";
        s[2]="Раму";

        for (int i=0; i < s.length; i++) {
            for (int m=0; m < s.length; m++) {
                for (int n=0; n < s.length; n++) {
                    if (i !=m & i != n & m != n) // убираем повторы
                        System.out.println(s[i] + s[n] + s[m]);
                }
            }
        }

        }

    }



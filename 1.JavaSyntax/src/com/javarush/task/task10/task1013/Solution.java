package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String a1, b1, c1, d1, e1, f1;
        public  Human () {
        }
        public Human (String a) {
            this.a1 = a;
        }
        public Human (String a, String b) {
            this(a);
            this.b1 = b;
        }
        public Human (String a, String b, String c) {
            this(a, b);
            this.c1 = c;
        }
        public Human (String a, String b, String c, String d) {
            this(a, b, c);
            this.d1 = d;
        }
        public Human (String a, String b, String c, String d, String e) {
            this(a, b, c, d);
            this.e1 = e;
        }
        public Human (String a, String b, String c, String d, String e, String f) {
            this(a, b, c, d, e);
            this.f1 = f;
        }
        public Human (String a, String b, String c, String d, String e, String f, int s) {
            this(a, b, c, d, e);
            this.f1 = f;
        }
        public Human (String a, String b, String c, String d, String e, String f, int s, int n) {
            this(a, b, c, d, e);
            this.f1 = f;
        }
        public Human (String a, String b, String c, String d, String e, String f, int s, int n, int m) {
            this(a, b, c, d, e);
            this.f1 = f;
        }

    }
}

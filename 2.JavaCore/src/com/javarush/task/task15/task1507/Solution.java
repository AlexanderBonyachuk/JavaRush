package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, value.charAt(0));
    }

    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами char");
        String st = Character.toString(value);
        printMatrix(m, n, Integer.parseInt(st));
    }

    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заполняем объектами int");
        printMatrix(m, n, (long) value);
    }

    public static void printMatrix(int m, int n, long value) {
        System.out.println("Заполняем объектами long");
        printMatrix(m, n, (double) value);
    }

    public static void printMatrix(int m, int n, double value) {
        System.out.println("Заполняем объектами double");
        printMatrix(m, n, (float) value);
    }

    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами float");
        printMatrix(m, n, (short) value);
    }

    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заполняем объектами short");
        printMatrix(m, n, (byte) value);
    }

    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами byte");
        boolean v = value < 0;
        printMatrix(m, n, v);
    }

    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println("Заполняем объектами Object");
    }
}

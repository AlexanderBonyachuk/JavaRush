package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.intVar );
        System.out.println(s1.doubleVar);
        System.out.println(s1.DoubleVar);
        System.out.println(s1.booleanVar);
        System.out.println(s1.ObjectVar);
        System.out.println(s1.ExceptionVar);
        System.out.println(s1.StringVar);
    }

}

package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(0.0,"первый");
        labels.put(1.0,"второй");
        labels.put(2.0,"третий");
        labels.put(3.0,"четвертый");
        labels.put(4.0,"пятый");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

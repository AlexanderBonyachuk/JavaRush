package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

    static class StringObject implements SimpleObject<String> {
        private String name = "Name";

        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }

}

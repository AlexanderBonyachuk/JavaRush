package com.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
Поиграем?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
//            System.out.println("Прерывание");
        }
    }

    public static class Gamer extends Thread {
        private int rating;
        int i = 0;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Add your code here - добавь код тут
            try {
            while (i < 4) {
                if (OnlineGame.isWinnerFound) {
                    interrupt();
                }

                    Thread.sleep(1000 / rating);

                System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                ++i;
                if (i == 4) {
                    if (!OnlineGame.isWinnerFound) {
                        OnlineGame.isWinnerFound = true;
                        System.out.println(getName() + ":победитель!");
                    } else {
                        System.out.println(getName() + ":проиграл");
                    }
                }
            }
            } catch (InterruptedException e) {
                System.out.println(getName() + ":проиграл");
            }
        }
    }
}
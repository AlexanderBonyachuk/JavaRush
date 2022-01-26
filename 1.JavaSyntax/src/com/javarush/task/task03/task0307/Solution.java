package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg gidrolisk1 = new Zerg();
        gidrolisk1.name = "gidrolisk1";
        Zerg gidrolisk2 = new Zerg();
        gidrolisk2.name = "gidrolisk2";
        Zerg gidrolisk3 = new Zerg();
        gidrolisk3.name = "gidrolisk3";
        Zerg gidrolisk4 = new Zerg();
        gidrolisk4.name = "gidrolisk4";
        Zerg gidrolisk5 = new Zerg();
        gidrolisk5.name = "gidrolisk5";

        Protoss stalker1 = new Protoss();
        stalker1.name = "stalker1";
        Protoss stalker2 = new Protoss();
        stalker2.name = "stalker2";
        Protoss stalker3 = new Protoss();
        stalker3.name = "stalker3";

        Terran morpeh1 = new Terran();
        morpeh1.name = "morpeh1";
        Terran morpeh2 = new Terran();
        morpeh2.name = "morpeh2";
        Terran morpeh3 = new Terran();
        morpeh3.name = "morpeh3";
        Terran morpeh4 = new Terran();
        morpeh4.name = "morpeh4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

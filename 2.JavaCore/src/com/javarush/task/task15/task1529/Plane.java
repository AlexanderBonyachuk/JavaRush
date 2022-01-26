package com.javarush.task.task15.task1529;

public class Plane implements CanFly  {
    private int passengers;
    @Override
    public void fly() {
        System.out.println("Plane fly");
    }
    public Plane(int p) {
        this.passengers = p;
    }

}

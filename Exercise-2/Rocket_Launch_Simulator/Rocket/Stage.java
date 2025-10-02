package com.rocketlauncher.rocket;

public class Stage {
    private int number;
    private int fuel;

    public Stage(int number, int fuel) {
        this.number = number;
        this.fuel = fuel;
    }

    public int getNumber() {
        return number;
    }

    public int getFuel() {
        return fuel;
    }
}


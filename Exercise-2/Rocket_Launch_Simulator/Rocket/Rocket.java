package com.rocketlauncher.rocket;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private List<Stage> stages = new ArrayList<>();
    private int currentStageIndex;
    private int fuel;
    private int altitude;
    private int speed;

    public Rocket() {
        stages.add(new Stage(1, 100)); // Stage 1 with 100 fuel units
        stages.add(new Stage(2, 50));  // Stage 2 with 50 fuel units
        currentStageIndex = 0;
        fuel = stages.get(currentStageIndex).getFuel();
        altitude = 0;
        speed = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCurrentStage() {
        return stages.get(currentStageIndex).getNumber();
    }

    public void advanceOneSecond() {
        if (fuel <= 0 && currentStageIndex < stages.size() - 1) {
            System.out.println("Stage " + getCurrentStage() + " complete. Separating stage. Entering Stage " + (currentStageIndex + 2));
            currentStageIndex++;
            fuel = stages.get(currentStageIndex).getFuel();
        }

        if (fuel > 0) {
            fuel -= 10;
            altitude += 10;
            speed += 1000;
        }
    }

    public boolean isOrbitAchieved() {
        return altitude >= 200;
    }
}

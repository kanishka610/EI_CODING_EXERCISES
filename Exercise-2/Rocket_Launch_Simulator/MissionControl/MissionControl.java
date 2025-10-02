
package com.rocketlauncher.missioncontrol;

import com.rocketlauncher.rocket.Rocket;

public class MissionControl {
    private static MissionControl instance;
    private Rocket rocket;
    private boolean preLaunchChecksComplete;
    private boolean launched;

    private MissionControl() {
        resetMission();
    }

    public static MissionControl getInstance() {
        if (instance == null) {
            instance = new MissionControl();
        }
        return instance;
    }

    // Resets rocket and mission state for a new launch
    private void resetMission() {
        rocket = new Rocket();
        preLaunchChecksComplete = false;
        launched = false;
    }

    public void performPreLaunchChecks() {
        resetMission();  // Reset mission state on new pre-launch checks
        preLaunchChecksComplete = true;
        System.out.println("All systems are 'Go' for launch.");
        printStatus();
    }

    public void launch() {
        if (!preLaunchChecksComplete) {
            System.out.println("Error: Pre-Launch checks not complete.");
            return;
        }
        launched = true;
        System.out.println("Launch initiated.");
        printStatus();
    }

    public void fastForward(int seconds) {
        if (!launched) {
            System.out.println("Error: Launch has not started yet.");
            return;
        }
        for (int i = 0; i < seconds; i++) {
            rocket.advanceOneSecond();
            if (rocket.isOrbitAchieved()) {
                break;
            }
            if (rocket.getFuel() <= 0) {
                break;
            }
        }
        printStatus();
        if (rocket.isOrbitAchieved()) {
            System.out.println("Orbit achieved! Mission Successful.");
        } else if (rocket.getFuel() <= 0) {
            System.out.println("Mission Failed due to insufficient fuel.");
        }
    }

    public void printStatus() {
        System.out.println("Stage: " + rocket.getCurrentStage() + ", Fuel: " + rocket.getFuel() +
                "%, Altitude: " + rocket.getAltitude() + " km, Speed: " + rocket.getSpeed() + " km/h");
    }
}

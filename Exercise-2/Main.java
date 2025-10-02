package com.rocketlauncher;

import com.rocketlauncher.commands.*;
import com.rocketlauncher.missioncontrol.MissionControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MissionControl missionControl = MissionControl.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command: start_checks, launch, fast_forward X, exit");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;

            String[] parts = input.split(" ");
            Command command = null;

            switch (parts[0]) {
                case "start_checks":
                    command = new StartChecksCommand(missionControl);
                    break;
                case "launch":
                    command = new LaunchCommand(missionControl);
                    break;
                case "fast_forward":
                    if (parts.length == 2) {
                        try {
                            int seconds = Integer.parseInt(parts[1]);
                            command = new FastForwardCommand(missionControl, seconds);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number of seconds.");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }

            if (command != null) {
                command.execute();
                missionControl.printStatus();
            }
        }

        scanner.close();
    }
}

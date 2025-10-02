# Rocket Launch Simulator

## Overview

This Rocket Launch Simulator is a terminal-based Java application that simulates a rocket launch mission placing a satellite into orbit. It uses discrete time steps representing seconds of the mission and provides real-time mission status updates.

The project demonstrates key software engineering principles including:

- Object-Oriented Programming (OOP)
- Design Patterns: Singleton, Command, Composite
- Clean code organization and modular design



## Features

- **Pre-Launch Checks**: Ensures systems are ready before launching.
- **Launch Sequence**: Simulates rocket stages, fuel consumption, altitude, and speed increases.
- **Fast Forward**: Skips ahead in the simulation for quick mission progress.
- **Mission Outcome**: Detects mission success or failure based on fuel and orbit status.
- **User Interaction**: Terminal-based input for start checks, launching, and fast-forwarding.



## Project Structure

src/
└── com/
└── rocketlauncher/
├── commands/ # Command interface and concrete command classes
├── rocket/ # Rocket and Stage classes modeling launch vehicle
├── missioncontrol/ # Singleton managing mission state and control
└── Main.java # Entry point for user interaction loop

text

---

## Usage

### Running the Simulator

1. Compile all source files from the `src` folder:
javac com\rocketlauncher\commands*.java com\rocketlauncher\rocket*.java com\rocketlauncher\missioncontrol*.java com\rocketlauncher\Main.java
2. Run the program:
java com.rocketlauncher.Main

text
3. Enter commands as prompted:
- `start_checks` — Performs pre-launch system checks.
- `launch` — Starts the rocket launch.
- `fast_forward X` — Advances the simulation by `X` seconds.
- `exit` — Exits the program.

---

## Example Session

Enter command: start_checks
All systems are 'Go' for launch.

Enter command: launch
Launch initiated.
Stage: 1, Fuel: 90%, Altitude: 10 km, Speed: 1000 km/h

Enter command: fast_forward 5
Stage: 1, Fuel: 40%, Altitude: 60 km, Speed: 6000 km/h

Enter command: fast_forward 15
Stage 1 complete. Separating stage. Entering Stage 2.
Stage: 2, Fuel: 35%, Altitude: 210 km, Speed: 21000 km/h

Enter command: exit



## Design Patterns Used

- **Singleton**: `MissionControl` ensures a single point of mission state management.
- **Command Pattern**: Encapsulates user commands (`start_checks`, `launch`, `fast_forward`) as objects for extensibility.
- **Composite Pattern**: Manages rocket stages as components of the whole rocket.

---

## Contact

For questions or suggestions, please contact the author eccentrickanishka@gmail.com


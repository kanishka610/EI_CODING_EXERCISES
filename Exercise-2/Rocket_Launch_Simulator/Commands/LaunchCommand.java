package com.rocketlauncher.commands;

import com.rocketlauncher.missioncontrol.MissionControl;

public class LaunchCommand implements Command {
    private MissionControl missionControl;

    public LaunchCommand(MissionControl missionControl) {
        this.missionControl = missionControl;
    }

    @Override
    public void execute() {
        missionControl.launch();
    }
}

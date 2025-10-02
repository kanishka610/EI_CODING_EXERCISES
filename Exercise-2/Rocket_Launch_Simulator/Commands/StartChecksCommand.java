package com.rocketlauncher.commands;

import com.rocketlauncher.missioncontrol.MissionControl;

public class StartChecksCommand implements Command {
    private MissionControl missionControl;

    public StartChecksCommand(MissionControl missionControl) {
        this.missionControl = missionControl;
    }

    @Override
    public void execute() {
        missionControl.performPreLaunchChecks();
    }
}

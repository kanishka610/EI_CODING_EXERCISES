package com.rocketlauncher.commands;

import com.rocketlauncher.missioncontrol.MissionControl;

public class FastForwardCommand implements Command {
    private MissionControl missionControl;
    private int seconds;

    public FastForwardCommand(MissionControl missionControl, int seconds) {
        this.missionControl = missionControl;
        this.seconds = seconds;
    }

    @Override
    public void execute() {
        missionControl.fastForward(seconds);
    }
}

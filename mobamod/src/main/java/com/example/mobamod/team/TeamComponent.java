package com.example.mobamod.component;

import com.example.mobamod.ecs.Component;

public class TeamComponent implements Component {

    private int teamId;

    public TeamComponent(int teamId) {
        this.teamId = teamId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
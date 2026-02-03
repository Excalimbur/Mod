package com.example.mobamod.component;

import com.example.mobamod.ecs.Component;

public class TeamComponent implements Component {
    public int teamId;

    public TeamComponent(int id) {
        this.teamId = id;
    }
}
package com.example.mobamod.ecs;

import java.util.ArrayList;
import java.util.List;

public class SystemManager {

    private static final List<SystemBase> SYSTEMS = new ArrayList<>();

    public static void register(SystemBase system) {
        SYSTEMS.add(system);
    }

    public static void tick() {
        for (SystemBase s : SYSTEMS) {
            s.tick();
        }
    }
}
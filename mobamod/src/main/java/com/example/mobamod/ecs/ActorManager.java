package com.example.mobamod.ecs;

import java.util.ArrayList;
import java.util.List;

public class ActorManager {

    private static final List<Actor> ACTORS = new ArrayList<>();

    public static void add(Actor actor) {
        ACTORS.add(actor);
    }

    public static List<Actor> all() {
        return ACTORS;
    }
}
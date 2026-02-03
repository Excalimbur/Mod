package com.exc.mobamod.actor;

import java.util.ArrayList;
import java.util.List;

public class ActorManager {

    private static final List<Actor> ACTORS = new ArrayList<>();

    public static void init() {}

    public static void addActor(Actor actor) {
        ACTORS.add(actor);
    }

    public static List<Actor> getActors() {
        return ACTORS;
    }
}

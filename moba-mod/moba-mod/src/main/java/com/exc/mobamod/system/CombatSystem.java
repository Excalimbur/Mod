package com.exc.mobamod.system;

import com.exc.mobamod.actor.Actor;
import com.exc.mobamod.actor.ActorManager;
import com.exc.mobamod.component.HealthComponent;

public class CombatSystem extends SystemBase {

    @Override
    public void tick() {
        for (Actor actor : ActorManager.getActors()) {
            if (actor.hasComponent(HealthComponent.class)) {
                HealthComponent hp = actor.getComponent(HealthComponent.class);

                if (hp.isDead()) {
                    System.out.println("Actor died");
                }
            }
        }
    }
}

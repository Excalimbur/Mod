package com.example.mobamod.system;

import com.example.mobamod.component.HealthComponent;
import com.example.mobamod.ecs.Actor;
import com.example.mobamod.ecs.ActorManager;
import com.example.mobamod.ecs.SystemBase;

public class CombatSystem extends SystemBase {

    @Override
    public void tick() {
        for (Actor a : ActorManager.all()) {
            if (a.has(HealthComponent.class)) {
                HealthComponent hp = a.get(HealthComponent.class);

                if (hp.dead()) {
                    System.out.println("Actor died");
                }
            }
        }
    }
}
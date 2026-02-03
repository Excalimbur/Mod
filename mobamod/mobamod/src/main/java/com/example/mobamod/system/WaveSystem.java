package com.example.mobamod.system;

import com.example.mobamod.entity.CreepEntity;
import com.example.mobamod.registry.ModEntities;
import com.example.mobamod.ecs.SystemBase;
import net.minecraft.server.MinecraftServer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class WaveSystem extends SystemBase {

    private int ticks = 0;
    private static MinecraftServer server;

    public WaveSystem() {
        ServerLifecycleEvents.SERVER_STARTED.register(s -> server = s);
    }

    @Override
    public void tick() {
        if (server == null) return;

        ticks++;

        if (ticks >= 20 * 30) {
            spawnWave();
            ticks = 0;
        }
    }

    private void spawnWave() {
        var world = server.getOverworld();

        CreepEntity creep = new CreepEntity(ModEntities.CREEP, world);
        creep.setPos(0, world.getTopY(), 0);

        world.spawnEntity(creep);

        System.out.println("Wave spawned");
    }
}
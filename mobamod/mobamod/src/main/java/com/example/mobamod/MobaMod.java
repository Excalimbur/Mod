package com.example.mobamod;

import com.example.mobamod.ecs.SystemManager;
import com.example.mobamod.registry.ModEntities;
import com.example.mobamod.system.CombatSystem;
import com.example.mobamod.system.WaveSystem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class MobaMod implements ModInitializer {

    public static final String MODID = "mobamod";

    @Override
    public void onInitialize() {

        ModEntities.register();

        SystemManager.register(new CombatSystem());
        SystemManager.register(new WaveSystem());

        ServerTickEvents.END_SERVER_TICK.register(server -> {
            SystemManager.tick();
        });
    }
}
package com.exc.mobamod;

import com.exc.mobamod.actor.ActorManager;
import com.exc.mobamod.system.WaveSystem;
import net.fabricmc.api.ModInitializer;

public class MobaMod implements ModInitializer {

    public static final String MODID = "mobamod";

    @Override
    public void onInitialize() {
        ActorManager.init();
        WaveSystem.init();

        System.out.println("MOBA Mod initialized!");
    }
}

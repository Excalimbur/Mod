package com.example.mobamod;

import com.example.mobamod.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.ZombieEntityRenderer;

public class MobaModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Используем рендер зомби для крипов
        EntityRendererRegistry.register(
                ModEntities.CREEP,
                ZombieEntityRenderer::new
        );
    }
}
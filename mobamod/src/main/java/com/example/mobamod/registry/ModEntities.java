package com.example.mobamod.registry;

import com.example.mobamod.MobaMod;
import com.example.mobamod.entity.CreepEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static EntityType<CreepEntity> CREEP;

    public static void register() {

        CREEP = Registry.register(
                Registries.ENTITY_TYPE,
                new Identifier(MobaMod.MODID, "creep"),
                FabricEntityTypeBuilder.createMob()
                        .entityFactory(CreepEntity::new)
                        .dimensions(EntityDimensions.fixed(0.6f, 1.8f))
                        .trackRangeBlocks(8)
                        .build()
        );
    }
}
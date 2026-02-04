package com.example.mobamod.registry;

import com.example.mobamod.MobaMod;
import com.example.mobamod.entity.CreepEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<CreepEntity> CREEP =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    new Identifier(MobaMod.MODID, "creep"),
                    FabricEntityTypeBuilder.createMob()
                            .entityFactory(CreepEntity::new)
                            .dimensions(EntityDimensions.fixed(0.6f, 1.8f))
                            .build()
            );

    public static void register() {

        // ВОТ ЭТО КРИТИЧНО
        FabricDefaultAttributeRegistry.register(
                CREEP,
                CreepEntity.createAttributes()
        );
    }
}

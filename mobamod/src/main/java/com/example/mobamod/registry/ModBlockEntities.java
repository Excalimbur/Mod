package com.example.mobamod.registry;

import com.example.mobamod.MobaMod;
import com.example.mobamod.building.BuildingBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static BlockEntityType<BuildingBlockEntity> BUILDING_BE;

    public static void register() {
        BUILDING_BE = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                new Identifier(MobaMod.MODID, "building_be"),
                FabricBlockEntityTypeBuilder.create(
                        BuildingBlockEntity::new,
                        ModBlocks.BUILDING
                ).build()
        );
    }
}
package com.example.mobamod.registry;

import com.example.mobamod.MobaMod;
import com.example.mobamod.building.BuildingBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BUILDING = new BuildingBlock();

    public static void register() {
        Registry.register(
                Registries.BLOCK,
                new Identifier(MobaMod.MODID, "building"),
                BUILDING
        );
    }
}
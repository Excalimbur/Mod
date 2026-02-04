package com.example.mobamod.building;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BuildingBlock extends BlockWithEntity {

    public BuildingBlock() {
        super(AbstractBlock.Settings.create()
                .strength(4.0f)
                .nonOpaque());
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BuildingBlockEntity(pos, state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (!world.isClient) {
            var be = world.getBlockEntity(pos);

            if (be instanceof BuildingBlockEntity building) {
                player.sendMessage(
                        net.minecraft.text.Text.literal(
                                "Owner: " + building.getTeamId() +
                                        " HP: " + building.getHealth()
                        ),
                        false
                );
            }
        }

        return ActionResult.SUCCESS;
    }
}
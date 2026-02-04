package com.example.mobamod.building;

import com.example.mobamod.registry.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class BuildingBlockEntity extends BlockEntity {

    private int teamId = -1;
    private float hp = 200;
    private float maxHp = 200;

    public BuildingBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BUILDING_BE, pos, state);
    }

    public static void tick(net.minecraft.world.World world,
                            BlockPos pos,
                            BlockState state,
                            BuildingBlockEntity be) {

        if (world.isClient) return;

        // простая регенерация
        if (be.hp < be.maxHp) {
            be.hp += 0.1f;
        }
    }

    public void damage(float amount) {
        hp -= amount;

        if (hp <= 0) {
            world.breakBlock(pos, false);
        }

        markDirty();
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int id) {
        teamId = id;
        markDirty();
    }

    public float getHealth() {
        return hp;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putInt("team", teamId);
        nbt.putFloat("hp", hp);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        teamId = nbt.getInt("team");
        hp = nbt.getFloat("hp");
    }
}
package com.example.mobamod.team;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.PersistentState;

public class TeamData extends PersistentState {

    public static final String KEY = "mobamod_teams";

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        return nbt;
    }

    public static TeamData createFromNbt(NbtCompound tag) {
        return new TeamData();
    }
}
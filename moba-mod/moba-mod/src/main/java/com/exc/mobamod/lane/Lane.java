package com.exc.mobamod.lane;

import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Lane {

    public final List<BlockPos> waypoints;

    public Lane(List<BlockPos> waypoints) {
        this.waypoints = waypoints;
    }
}

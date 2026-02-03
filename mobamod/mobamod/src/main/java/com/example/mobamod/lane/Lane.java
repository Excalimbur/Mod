package com.example.mobamod.lane;

import net.minecraft.util.math.BlockPos;
import java.util.List;

public class Lane {

    private final List<BlockPos> points;

    public Lane(List<BlockPos> points) {
        this.points = points;
    }

    public List<BlockPos> getPoints() {
        return points;
    }
}
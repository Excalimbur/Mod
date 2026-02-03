package com.example.mobamod.lane;

import java.util.ArrayList;
import java.util.List;

public class LaneManager {

    private static final List<Lane> LANES = new ArrayList<>();

    public static void add(Lane lane) {
        LANES.add(lane);
    }

    public static List<Lane> get() {
        return LANES;
    }
}
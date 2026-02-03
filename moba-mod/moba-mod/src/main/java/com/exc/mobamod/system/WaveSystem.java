package com.exc.mobamod.system;

public class WaveSystem {

    private static int tickCounter = 0;

    public static void init() {}

    public static void tick() {
        tickCounter++;

        if (tickCounter >= 20 * 30) { // каждые 30 сек
            spawnWave();
            tickCounter = 0;
        }
    }

    private static void spawnWave() {
        System.out.println("Wave spawned!");
    }
}

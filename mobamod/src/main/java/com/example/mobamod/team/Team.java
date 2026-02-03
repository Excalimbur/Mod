package com.example.mobamod.team;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Team {

    private final int id;
    private final String name;
    private final Formatting color;

    private final Set<UUID> players = new HashSet<>();

    public Team(int id, String name, Formatting color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Formatting getColor() {
        return color;
    }

    public void addPlayer(ServerPlayerEntity player) {
        players.add(player.getUuid());
    }

    public void removePlayer(ServerPlayerEntity player) {
        players.remove(player.getUuid());
    }

    public boolean hasPlayer(ServerPlayerEntity player) {
        return players.contains(player.getUuid());
    }

    public Set<UUID> getPlayers() {
        return players;
    }

    public Text getDisplayName() {
        return Text.literal(name).formatted(color);
    }
}

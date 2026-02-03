package com.example.mobamod.team;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Formatting;

import java.util.*;

public class TeamManager {

    private static final Map<Integer, Team> TEAMS = new HashMap<>();
    private static final Map<UUID, Integer> PLAYER_TEAM = new HashMap<>();

    public static final int TEAM_RED = 1;
    public static final int TEAM_BLUE = 2;
    public static final int TEAM_GREEN = 3;
    public static final int TEAM_AI = 99;

    public static void init() {
        register(new Team(TEAM_RED, "Red", Formatting.RED));
        register(new Team(TEAM_BLUE, "Blue", Formatting.AQUA));
        register(new Team(TEAM_GREEN, "Green", Formatting.GREEN));
        register(new Team(TEAM_AI, "Outpost", Formatting.DARK_GRAY));
    }

    private static void register(Team team) {
        TEAMS.put(team.getId(), team);
    }

    public static Team get(int id) {
        return TEAMS.get(id);
    }

    public static Collection<Team> all() {
        return TEAMS.values();
    }

    public static void assignPlayer(ServerPlayerEntity player, int teamId) {

        removePlayer(player);

        Team team = get(teamId);
        if (team == null) return;

        team.addPlayer(player);
        PLAYER_TEAM.put(player.getUuid(), teamId);
    }

    public static void removePlayer(ServerPlayerEntity player) {
        Integer old = PLAYER_TEAM.remove(player.getUuid());
        if (old != null) {
            Team t = get(old);
            if (t != null) t.removePlayer(player);
        }
    }

    public static Team getPlayerTeam(ServerPlayerEntity player) {
        Integer id = PLAYER_TEAM.get(player.getUuid());
        return id == null ? null : get(id);
    }

    public static boolean sameTeam(ServerPlayerEntity a, ServerPlayerEntity b) {
        return Objects.equals(
                PLAYER_TEAM.get(a.getUuid()),
                PLAYER_TEAM.get(b.getUuid())
        );
    }
}
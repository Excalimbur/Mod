package com.example.mobamod.team;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerPlayConnectionEvents;

import java.util.Comparator;

public class TeamAutoAssign {

    public static void init() {

        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {

            var player = handler.getPlayer();

            int smallestTeamId = TeamManager.all().stream()
                    .filter(t -> t.getId() != TeamManager.TEAM_AI)
                    .min(Comparator.comparingInt(t -> t.getPlayers().size()))
                    .orElseThrow()
                    .getId();

            TeamManager.assignPlayer(player, smallestTeamId);

            player.sendMessage(
                    TeamManager.get(smallestTeamId).getDisplayName()
                            .copy()
                            .append(" team joined!"),
                    false
            );
        });
    }
}
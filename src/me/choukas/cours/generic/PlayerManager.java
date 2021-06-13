package me.choukas.cours.generic;

import java.util.*;

public class PlayerManager {

    private final Map<Integer, Player> players = new HashMap<>();

    public void addPlayer(Player player) {
        this.players.put(player.getId(), player);
    }

    public Optional<Player> getPlayer(int id) {
        return Optional.ofNullable(players.get(id));
    }

    public Collection<Player> getPlayers() {
        return players.values();
    }
}

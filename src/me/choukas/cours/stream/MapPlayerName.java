package me.choukas.cours.stream;

import me.choukas.cours.generic.Player;

import java.util.function.Function;

public class MapPlayerName implements Function<Player, String> {

    @Override
    public String apply(Player player) {
        return player.getName();
    }
}

package me.choukas.cours;

import me.choukas.cours.generic.Player;
import me.choukas.cours.generic.PlayerManager;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();
        playerManager.addPlayer(new Player(1, "Juan"));
        playerManager.addPlayer(new Player(2, "Notch"));
        playerManager.addPlayer(new Player(3, "Enzo"));
        playerManager.addPlayer(new Player(4, "md-5"));
        playerManager.addPlayer(new Player(5, "Choukas"));

        Optional<Player> optionalPlayer = playerManager.getPlayer(5);

        if (optionalPlayer.isPresent()) {
            Player player = optionalPlayer.get(); // Ici je vais récupérer Choukas

            // Utilisation de la variable player
        }

        /* +---+
           -----
           +---+
         */

        Function<Player, String> mapPlayerName = new Function<Player, String>() {
            @Override
            public String apply(Player player) {
                return player.getName();
            }
        };

        // 5 / 2 = 2

        // 5 % 2 = 1
        // 4 % 2 = 0
        // 50 % 2 = 0

        Collection<Player> players = playerManager.getPlayers();
        List<String> playerNames = players.stream()
                .filter(player -> player.getId() % 2 == 0)
                .map(player -> player.getName())
                .collect(Collectors.toList());

        /*players.stream()
                .map(new MapPlayerName());*/ // Pareil

        /*players.stream()
                .map(mapPlayerName);*/ // Pareil

        // (1, "Juan"), (2, "Notch"), (3, "Enzo"), (4, "md-5), (5, "Choukas")

        // 1) (2, "Notch"), (4, "md-5)
        // 2) ("Notch", "md-5")
    }

    public static int affiche(int a, int b) {
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        return b;
    }
}

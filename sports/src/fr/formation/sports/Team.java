package fr.formation.sports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {

    private String name;

    private List<Player> players = new ArrayList<>();

    public Team(String name, Player... players) {
	this.name = name;
	if (players.length > 1 && players.length < 12) {
	    for (Player player : players) {
		addPlayer(player);
	    }
	} else {
	    throw new IllegalArgumentException(
	            "A team is composed of minimum 2 players and maximum 11 players");
	}
    }

    private void addPlayer(Player player) {
	Objects.requireNonNull("A player should not be null");
	players.add(player);
    }

    public String getName() {
	return name;
    }

    public List<Player> getPlayers() {
	return players;
    }
}

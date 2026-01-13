package com.gamebox;

import java.util.*;

class User {

	private String username;
	private List<Game> ownedGames;

	public User(String username) {
		this.username = username;
		this.ownedGames = new ArrayList<>();
	}

	// Encapsulation: no direct access to owned games
	public void buyGame(Game game) {
		ownedGames.add(game);
		System.out.println(username + " owns " + game.title);
	}

	public void showOwnedGames() {
		System.out.println(username + "'s Games:");
		for (Game g : ownedGames) {
			System.out.println("- " + g.title);
		}
	}
}

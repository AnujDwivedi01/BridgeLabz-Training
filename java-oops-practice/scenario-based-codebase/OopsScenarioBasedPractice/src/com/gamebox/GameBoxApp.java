package com.gamebox;

public class GameBoxApp {

	public static void main(String[] args) {

		Game game1 = new ArcadeGame("Speed Rush", 0, 4.5);
		Game game2 = new StrategyGame("Empire Builder", 499, 4.8);

		game2.applyDiscount(20); // seasonal offer

		User user = new User("Anuj");

		game1.download();
		game1.playDemo();

		System.out.println();

		game2.download();
		game2.playDemo();

		user.buyGame(game1);
		user.buyGame(game2);

		System.out.println();
		user.showOwnedGames();
	}
}

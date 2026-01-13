package com.gamebox;

class ArcadeGame extends Game {

	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	@Override
	public void download() {
		System.out.println(title + " arcade game downloaded");
	}

	@Override
	public void playDemo() {
		System.out.println("Arcade demo: 2-minute quick play");
	}
}

package com.songvalut;

public class Song extends Media<String> {

	private String genre;

	public Song(String title, String artist, String duration, String genre) {
		super(title, artist, duration);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
}

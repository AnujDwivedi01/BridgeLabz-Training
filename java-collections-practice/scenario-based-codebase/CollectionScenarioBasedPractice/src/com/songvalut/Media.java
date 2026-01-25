package com.songvalut;

public abstract class Media<T> {

	protected String title;
	protected String artist;
	protected T duration;

	public Media(String title, String artist, T duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public T getDuration() {
		return duration;
	}
}

package com.tree.musicapp;

class SongNode {
	int trackId;
	String title;
	String artist;
	SongNode left, right;

	SongNode(int trackId, String title, String artist) {
		this.trackId = trackId;
		this.title = title;
		this.artist = artist;
		left = right = null;
	}
}

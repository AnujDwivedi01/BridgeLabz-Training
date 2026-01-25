package com.songvalut;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class SongLibrary {

	private List<Song> songs = new ArrayList<>();

	public void addSong(Song song) {
		songs.add(song);
	}

	public List<Song> getAllSongs() {
		return songs;
	}

	public Map<String, List<Song>> groupByGenre() {
		return songs.stream().collect(Collectors.groupingBy(Song::getGenre));
	}

	public Set<String> getUniqueArtists() {
		return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
	}

	public List<Song> filterByArtist(String artist) {
		return songs.stream().filter(s -> s.getArtist().equalsIgnoreCase(artist)).collect(Collectors.toList());
	}

	public List<Song> sortByTitle() {
		return songs.stream().sorted(Comparator.comparing(Song::getTitle)).collect(Collectors.toList());
	}
}

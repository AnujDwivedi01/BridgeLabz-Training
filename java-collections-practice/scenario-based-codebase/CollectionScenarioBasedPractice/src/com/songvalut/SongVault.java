package com.songvalut;

import java.io.File;

public class SongVault {

	public static void main(String[] args) throws Exception {

		SongParser parser = new SongParser();
		SongLibrary library = new SongLibrary();

		File folder = new File("D:\\filehandling\\file1.txt");

		for (File file : folder.listFiles()) {
			Song song = parser.parse(file);
			library.addSong(song);
		}

		System.out.println("🎧 Unique Artists:");
		library.getUniqueArtists().forEach(System.out::println);

		System.out.println("\n🎼 Songs Grouped By Genre:");
		library.groupByGenre().forEach((g, list) -> {
			System.out.println(g + " -> " + list.size());
		});

		System.out.println("\n🔤 Songs Sorted By Title:");
		library.sortByTitle().forEach(s -> System.out.println(s.getTitle()));
	}
}

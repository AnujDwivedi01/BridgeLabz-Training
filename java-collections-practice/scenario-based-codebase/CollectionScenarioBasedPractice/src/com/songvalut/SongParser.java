package com.songvalut;

import java.io.*;
import java.util.regex.*;

public class SongParser {

	private static final Pattern TITLE = Pattern.compile("Title:\\s*(.*)");
	private static final Pattern ARTIST = Pattern.compile("Artist:\\s*(.*)");
	private static final Pattern DURATION = Pattern.compile("Duration:\\s*(.*)");
	private static final Pattern GENRE = Pattern.compile("Genre:\\s*(.*)");

	public Song parse(File file) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;

		String title = null, artist = null, duration = null, genre = null;

		while ((line = br.readLine()) != null) {

			if (TITLE.matcher(line).matches())
				title = line.split(":")[1].trim();

			else if (ARTIST.matcher(line).matches())
				artist = line.split(":")[1].trim();

			else if (DURATION.matcher(line).matches())
				duration = line.split(":")[1].trim();

			else if (GENRE.matcher(line).matches())
				genre = line.split(":")[1].trim();
		}
		return new Song(title, artist, duration, genre);
	}
}

package com.tree.musicapp;

public class MusicLibraryBST {

	SongNode root;

	// 🔹 Insert New Track (BST based on Song Title)
	SongNode insert(SongNode root, int trackId, String title, String artist) {
		if (root == null) {
			return new SongNode(trackId, title, artist);
		}

		if (title.compareToIgnoreCase(root.title) < 0) {
			root.left = insert(root.left, trackId, title, artist);
		} else {
			root.right = insert(root.right, trackId, title, artist);
		}
		return root;
	}

	// 🔹 Search Track using Track ID
	SongNode searchByTrackId(SongNode root, int trackId) {
		if (root == null)
			return null;

		if (root.trackId == trackId)
			return root;

		SongNode leftResult = searchByTrackId(root.left, trackId);
		if (leftResult != null)
			return leftResult;

		return searchByTrackId(root.right, trackId);
	}

	// 🔹 Display Playlist Alphabetically (In-order Traversal)
	void displayAlphabetically(SongNode root) {
		if (root != null) {
			displayAlphabetically(root.left);
			System.out.println("Track ID: " + root.trackId + ", Title: " + root.title + ", Artist: " + root.artist);
			displayAlphabetically(root.right);
		}
	}

	// 🔹 Main Method (Demo)
	public static void main(String[] args) {

		MusicLibraryBST library = new MusicLibraryBST();

		// Insert Songs
		library.root = library.insert(library.root, 301, "Believer", "Imagine Dragons");
		library.root = library.insert(library.root, 305, "Closer", "Chainsmokers");
		library.root = library.insert(library.root, 302, "Apna Bana Le", "Arijit Singh");
		library.root = library.insert(library.root, 308, "Despacito", "Luis Fonsi");

		// Search by Track ID
		System.out.println("Searching Track ID 302:");
		SongNode song = library.searchByTrackId(library.root, 302);
		if (song != null) {
			System.out.println("Found: " + song.title + " by " + song.artist);
		} else {
			System.out.println("Song not found!");
		}

		// Display Playlist Alphabetically
		System.out.println("\nPlaylist (Alphabetical Order):");
		library.displayAlphabetically(library.root);
	}
}

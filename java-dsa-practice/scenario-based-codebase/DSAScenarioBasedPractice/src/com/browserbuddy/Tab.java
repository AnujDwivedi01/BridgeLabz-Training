package com.browserbuddy;

public class Tab {
	private HistoryNode current;

	// for visiting a new page
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);

		if (current != null) {
			current.next = newNode;
			newNode.prev = current;
		}

		current = newNode;
		System.out.println("Visited " + url);
	}

	// go back
	public void back() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to : " + current.url);

		} else
			System.out.println("No Previous pagen found");
	}

	// forward
	public void forward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Visited : " + current.url);
		} else
			System.out.println("No Next Page found");
	}

	public String getCurrentPage() {
		return current != null ? current.url : "Blank Tab";
	}

}

package com.examresultuploader;

import java.util.*;

public class TopScorerService {

	public int findTopScore(List<Integer> marks) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		pq.addAll(marks);
		return pq.peek();
	}
}

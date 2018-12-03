package com.algorithm.leetcode;

import java.util.*;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/11/6
 */
public class T692 {
	
	public List<String> t692(String[] words, int k) {
		Map<String, Integer> countMap = new HashMap<>();
		for (String word : words) {
			countMap.put(word, countMap.getOrDefault(word, 0) + 1);
		}
		List<String> candidates = new ArrayList<>(countMap.keySet());
		Collections.sort(candidates, (w1, w2) ->
				countMap.get(w1).equals(countMap.get(w2)) ? w1.compareTo(w2) : countMap.get(w2) - countMap.get(w1));
		
		
		return candidates.subList(0, k);
		
	}
}

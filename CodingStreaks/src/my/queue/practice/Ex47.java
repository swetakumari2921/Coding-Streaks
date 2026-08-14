package my.queue.practice;

import java.util.*;

public class Ex47 {

	public static int wordLadder(String beginWord, String endWord, List<String> wordList) {

		Set<String> wordSet = new HashSet<>(wordList);

		// End word must be present
		if (!wordSet.contains(endWord)) {
			return 0;
		}

		Queue<String> queue = new LinkedList<>();
		queue.add(beginWord);

		int level = 1;

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				String current = queue.poll();

				// Try changing every character
				for (int j = 0; j < current.length(); j++) {

					char[] chars = current.toCharArray();

					for (char ch = 'a'; ch <= 'z'; ch++) {

						chars[j] = ch;

						String nextWord = new String(chars);

						// Found destination
						if (nextWord.equals(endWord)) {
							return level + 1;
						}

						// Add only unvisited valid words
						if (wordSet.contains(nextWord)) {
							queue.add(nextWord);
							wordSet.remove(nextWord);
						}
					}
				}
			}

			level++;
		}

		return 0;
	}

	public static void main(String[] args) {

		String beginWord = "hit";
		String endWord = "cog";

		List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

		int result = wordLadder(beginWord, endWord, wordList);

		System.out.println("Shortest Transformation Length: " + result);
	}
}

package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex11 {

	static void firstNonRepeating(String str) {

		Queue<Character> queue = new LinkedList<>();

		int[] freq = new int[26];

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			// Increase frequency
			freq[ch - 'a']++;

			// Add character to queue
			queue.add(ch);

			// Remove repeating characters from front
			while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
				queue.remove();
			}

			if (queue.isEmpty()) {
				System.out.print("-1 ");
			} else {
				System.out.print(queue.peek() + " ");
			}
		}
	}

	public static void main(String[] args) {

		String str = "aabc";

		System.out.print("First non-repeating characters: ");
		firstNonRepeating(str);
	}
}

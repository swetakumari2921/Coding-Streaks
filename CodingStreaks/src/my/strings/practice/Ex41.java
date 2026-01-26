package my.strings.practice;

import java.util.HashMap;

public class Ex41 {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";

		String[] words = str.split(" ");

		if (pattern.length() != words.length) {
			System.out.println("Pattern does NOT match");
			return;
		}

		HashMap<Character, String> map = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];

			if (map.containsKey(ch)) {
				if (!map.get(ch).equals(word)) {
					System.out.println("Pattern does NOT match");
					return;
				}
			} else {
				if (map.containsValue(word)) {
					System.out.println("Pattern does NOT match");
					return;
				}
				map.put(ch, word);
			}
		}

		System.out.println("Pattern matches");
	}
}

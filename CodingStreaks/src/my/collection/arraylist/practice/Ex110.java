package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex110 {

	static int longest(String str) {
		ArrayList<Character> list = new ArrayList<>();
		int max = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			while (list.contains(ch)) {
				list.remove(0);
			}

			list.add(ch);
			if (list.size() > max) {
				max = list.size();
			}
		}

		return max;
	}

	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(longest(str));
	}
}

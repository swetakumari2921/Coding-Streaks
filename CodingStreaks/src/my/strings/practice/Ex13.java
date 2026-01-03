package my.strings.practice;

import java.util.*;

// 14. Count words in a string

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine().trim();
		char[] arr = sentence.toCharArray();
		int count = 0;
		boolean isWords = false;

		if (sentence.isEmpty()) {
			System.out.println("Words: 0");
			sc.close();
			return;
		}

		for (int i = 0; i < sentence.length(); i++) {
			if (arr[i] !=' ' && !isWords) {
				count++;
				isWords = true;
			} else if (arr[i] == ' ') {
				isWords = false;
			}
		}

		System.out.println("Words: " + count);
		sc.close();
	}
}

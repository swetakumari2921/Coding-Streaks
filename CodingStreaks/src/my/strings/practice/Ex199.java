package my.strings.practice;

import java.util.Scanner;

public class Ex199 {

	static String[] words = { "apple", "application", "app", "banana", "bat", "ball", "cat", "car", "cart" };

	static void autocomplete(String prefix) {
		boolean found = false;

		for (int i = 0; i < words.length; i++) {
			if (startsWith(words[i], prefix)) {
				System.out.println(words[i]);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No suggestions found.");
		}
	}

	static boolean startsWith(String word, String prefix) {
		if (prefix.length() > word.length())
			return false;

		for (int i = 0; i < prefix.length(); i++) {
			if (word.charAt(i) != prefix.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter prefix: ");
		String prefix = sc.nextLine();

		System.out.println("Suggestions:");
		autocomplete(prefix);

		sc.close();
	}
}

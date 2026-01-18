package my.strings.practice;

// Remove consonants from a string

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		char[] chars = input.toCharArray();
		String result = "";

		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];

			// Check if character is a vowel or non-alphabet
			if (isVowel(ch) || !isAlphabet(ch)) {
				result = result + ch;
			}
		}

		System.out.println("String after removing consonants:");
		System.out.println(result);
		sc.close();
	}

	// Method to check vowel
	public static boolean isVowel(char ch) {
		ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	// Method to check alphabet
	public static boolean isAlphabet(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}
	
}

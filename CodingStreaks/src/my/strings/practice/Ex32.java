package my.strings.practice;

import java.util.Scanner;

// Remove vowels from a string

public class Ex32 {
	public static String removeVowels(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
					&& ch != 'O' && ch != 'U') {

				result = result + ch;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		String output = removeVowels(input);

		System.out.println("String after removing vowels: " + output);
	}
}

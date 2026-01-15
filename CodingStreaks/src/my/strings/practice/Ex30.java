package my.strings.practice;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();

		String[] words = input.split(" ");
		String result = "";

		for (String word : words) {
			if (word.length() > 0) {
				result = result + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
			}
		}

		System.out.println("Output: " + result.trim());
		sc.close();
	}
}

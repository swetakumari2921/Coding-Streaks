package my.strings.practice;

import java.util.Scanner;

public class Ex92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String input = sc.nextLine();

		// Regex pattern: only lowercase letters
		String pattern = "[a-z]+";

		if (input.matches(pattern)) {
			System.out.println("String matches the pattern!");
		} else {
			System.out.println("String does NOT match the pattern.");
		}

		sc.close();
	}
}

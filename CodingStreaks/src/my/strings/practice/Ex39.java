package my.strings.practice;

// Check if string contains special characters

import java.util.Scanner;

public class Ex39 {

	public static boolean containsSpecialCharacter(String str) {
		return !str.matches("[a-zA-Z0-9]*");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		if (containsSpecialCharacter(input)) {
			System.out.println("The string contains special characters.");
		} else {
			System.out.println("The string does NOT contain any special characters.");
		}

		sc.close();
	}
}

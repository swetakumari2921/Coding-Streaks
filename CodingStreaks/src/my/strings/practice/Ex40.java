package my.strings.practice;

import java.util.Scanner;

// Find number of uppercase and lowercase letters

public class Ex40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int upperCount = 0;
		int lowerCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				upperCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCount++;
			}
		}

		System.out.println("Uppercase letters: " + upperCount);
		System.out.println("Lowercase letters: " + lowerCount);
	}
}

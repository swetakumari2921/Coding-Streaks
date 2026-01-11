package my.strings.practice;

import java.util.Scanner;

// Check if two strings are rotations of each other

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Take user input
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		// Step 2: Check length first
		if (str1.length() != str2.length()) {
			System.out.println("Strings are NOT rotations of each other");
		} else {
			// Step 3: Concatenate first string with itself
			String temp = str1 + str1;

			// Step 4: Check if str2 is substring of temp
			if (temp.contains(str2)) {
				System.out.println("Strings are rotations of each other");
			} else {
				System.out.println("Strings are NOT rotations of each other");
			}
		}

		sc.close();
	}
}

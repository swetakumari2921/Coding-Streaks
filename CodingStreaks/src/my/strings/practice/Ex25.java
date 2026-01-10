package my.strings.practice;

import java.util.Scanner;

// Check if two strings are anagrams

public class Ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Take user input
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		// Step 2: Remove spaces and convert to lowercase
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Step 3: Check length
		if (str1.length() != str2.length()) {
			System.out.println("The strings are NOT anagrams.");
			sc.close();
			return;
		}

		int n = str1.length();

		// Step 4: Use arrays to count character frequency
		int[] count = new int[26]; // for lowercase a-z only

		for (int i = 0; i < n; i++) {
			count[str1.charAt(i) - 'a']++; // increment for first string
			count[str2.charAt(i) - 'a']--; // decrement for second string
		}

		// Step 5: Check if all counts are 0
		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				isAnagram = false;
				break;
			}
		}

		// Step 6: Print result
		if (isAnagram) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are NOT anagrams.");
		}

		sc.close();

	}
}

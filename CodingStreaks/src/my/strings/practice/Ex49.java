package my.strings.practice;

import java.util.*;

public class Ex49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		if (canFormPalindrome(str)) {
			System.out.println("Yes, the string can form a palindrome.");
		} else {
			System.out.println("No, the string cannot form a palindrome.");
		}

		sc.close();
	}

	private static boolean canFormPalindrome(String s) {
		int[] freq = new int[256];

		for (char c : s.toCharArray()) {
			freq[c]++;
		}

		int oddCount = 0;
		for (int count : freq) {
			if (count % 2 != 0) {
				oddCount++;
			}
		}

		return oddCount <= 1;
	}
}

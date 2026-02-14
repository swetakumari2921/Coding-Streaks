package my.arrays.practice;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");
		String s = sc.nextLine();

		int n = s.length();
		String longest = "";

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int k = 0;
				while (i + k < n && j + k < n && s.charAt(i + k) == s.charAt(j + k)) {
					k++;
				}
				if (k > longest.length()) {
					longest = s.substring(i, i + k);
				}
			}
		}

		System.out.println("Longest repeating substring: " + longest);
	}
}

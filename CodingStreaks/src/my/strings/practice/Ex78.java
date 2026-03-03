package my.strings.practice;

import java.util.Scanner;

public class Ex78 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter main string:");
		String str = sc.nextLine();

		System.out.println("Enter substring:");
		String sub = sc.nextLine();

		int count = 0;

		for (int i = 0; i <= str.length() - sub.length(); i++) {

			int j;

			for (j = 0; j < sub.length(); j++) {
				if (str.charAt(i + j) != sub.charAt(j)) {
					break;
				}
			}

			if (j == sub.length()) {
				count++;
			}
		}

		System.out.println("Number of occurrences: " + count);
	}
}

package my.strings.practice;

import java.util.Scanner;

public class Ex173 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String largest = "";

		for (int i = 0; i < str.length(); i++) {
			String sub = str.substring(i);

			if (sub.compareTo(largest) > 0) {
				largest = sub;
			}
		}

		System.out.println("Lexicographically Largest Substring: " + largest);

		sc.close();
	}
}

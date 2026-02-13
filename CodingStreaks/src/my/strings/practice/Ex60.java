package my.strings.practice;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = sc.nextLine();

		System.out.print("Enter substring length: ");
		int k = sc.nextInt();

		String smallest = str.substring(0, k);
		String largest = str.substring(0, k);

		for (int i = 1; i <= str.length() - k; i++) {
			String sub = str.substring(i, i + k);

			if (sub.compareTo(smallest) < 0) {
				smallest = sub;
			}

			if (sub.compareTo(largest) > 0) {
				largest = sub;
			}
		}

		System.out.println("Lexicographically Smallest Substring: " + smallest);
		System.out.println("Lexicographically Largest Substring: " + largest);
	}
}

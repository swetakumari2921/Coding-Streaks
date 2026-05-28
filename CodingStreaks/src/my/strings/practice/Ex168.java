package my.strings.practice;

import java.util.Scanner;

public class Ex168 {

	public static int myIndexOf(String str, String search) {

		for (int i = 0; i <= str.length() - search.length(); i++) {

			int j;

			for (j = 0; j < search.length(); j++) {

				if (str.charAt(i + j) != search.charAt(j)) {
					break;
				}
			}

			if (j == search.length()) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter main string:");
		String str = sc.nextLine();

		System.out.println("Enter search string:");
		String search = sc.nextLine();

		int index = myIndexOf(str, search);

		System.out.println("Index: " + index);
	}
}

package my.strings.practice;

import java.util.Scanner;

public class Ex66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter main string:");
		String text = sc.nextLine();

		System.out.println("Enter substring to search:");
		String pattern = sc.nextLine();

		int index = -1;
		int n = text.length();
		int m = pattern.length();

		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}
			if (j == m) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("Substring not found");
		} else {
			System.out.println("Substring found at index: " + index);
		}
	}
}

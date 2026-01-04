package my.strings.practice;

import java.util.Scanner;

// 19. Print duplicate characters

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		char[] chars = str.toCharArray();
		boolean[] visited = new boolean[chars.length];

		System.out.println("Duplicate characters:");

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ' || visited[i]) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					count++;
					visited[j] = true;
				}
			}

			if (count > 1) {
				System.out.print(chars[i] + " ");
			}
		}

		sc.close();
	}
}

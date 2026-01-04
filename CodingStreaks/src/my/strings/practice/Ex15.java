package my.strings.practice;

import java.util.Scanner;

// 16. Remove spaces from a string

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		char[] chars = str.toCharArray();
		String result = "";

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ') {
				result = result + chars[i];
			}
		}

		System.out.println("String after removing spaces:");
		System.out.println(result);

		sc.close();
	}
}

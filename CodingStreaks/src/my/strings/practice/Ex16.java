package my.strings.practice;

import java.util.Scanner;

// 17. Replace spaces with special character

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Enter special character to replace spaces: ");
		char specialChar = sc.next().charAt(0);

		char[] chars = str.toCharArray();
		String result = "";

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				result = result + specialChar;
			} else {
				result = result + chars[i];
			}
		}

		System.out.println("String after replacing spaces:");
		System.out.println(result);

		sc.close();
	}
}

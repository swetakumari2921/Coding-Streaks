package my.strings.practice;

import java.util.Scanner;

// 18. Find frequency of a character

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Enter a character to find frequency: ");
		char ch = sc.next().charAt(0);

		int count = 0;
		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ch) {
				count++;
			}
		}

		System.out.println("Frequency of '" + ch + "' is: " + count);

		sc.close();
	}
}

package my.strings.practice;

// Count punctuation characters

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		char[] punctuation = { '.', ',', '!', '?', ';', ':', '\'', '"', '-', '(', ')', '[', ']', '{', '}' };

		char[] chars = str.toCharArray();
		int count = 0;

		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < punctuation.length; j++) {
				if (chars[i] == punctuation[j]) {
					count++;
					break;
				}
			}
		}

		System.out.println("Number of punctuation characters: " + count);

		sc.close();
	}
}

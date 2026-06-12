package my.strings.practice;

import java.util.Scanner;

public class Ex183 {

	static int index = 0;

	static String decode(String s) {
		String result = "";

		while (index < s.length() && s.charAt(index) != ']') {

			if (Character.isDigit(s.charAt(index))) {

				int num = 0;
				while (Character.isDigit(s.charAt(index))) {
					num = num * 10 + (s.charAt(index) - '0');
					index++;
				}

				index++; // Skip '['

				String decodedPart = decode(s);

				index++; // Skip ']'

				for (int i = 0; i < num; i++) {
					result += decodedPart;
				}
			} else {
				result += s.charAt(index);
				index++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter encoded string: ");
		String s = sc.nextLine();

		index = 0;
		String decoded = decode(s);

		System.out.println("Decoded string: " + decoded);

		sc.close();
	}
}

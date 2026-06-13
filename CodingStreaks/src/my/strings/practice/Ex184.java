package my.strings.practice;

import java.util.Scanner;

public class Ex184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String result = "";

		int count = 1;

		for (int i = 1; i <= str.length(); i++) {
			if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				result += str.charAt(i - 1) + String.valueOf(count);
				count = 1;
			}
		}

		System.out.println("Encoded String: " + result);
	}
}

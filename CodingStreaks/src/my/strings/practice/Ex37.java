package my.strings.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		boolean onlyDigits = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				onlyDigits = false;
				break;
			}
		}
		if (onlyDigits) {
			System.out.println("The string contains only digits");
		} else {
			System.out.println("The string contains non-digit characters");
		}
		sc.close();
	}
}

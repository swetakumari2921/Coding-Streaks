package my.strings.practice;

import java.util.Scanner;

// Check if string contains only alphabets

public class Ex38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		if (str.matches("^[a-zA-Z]+$")) {
			System.out.println("The string contains only alphabets.");
		} else {
			System.out.println("The string does NOT contain only alphabets.");
		}

		sc.close();
	}
}

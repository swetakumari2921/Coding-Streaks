package my.strings.practice;

import java.util.Scanner;

public class Ex31 {
	public String toggleCase(String input) {

		char[] arr = input.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] + 32);
			} else if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] - 32);
			}
		}

		return new String(arr);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----- Toggle Case Program -----");
		System.out.println("This program converts uppercase letters to lowercase");
		System.out.println("and lowercase letters to uppercase.");
		System.out.println();

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		Ex31 obj = new Ex31();
		String result = obj.toggleCase(input);

		System.out.println();
		System.out.println("Toggled String: " + result);

		sc.close();
	}
}

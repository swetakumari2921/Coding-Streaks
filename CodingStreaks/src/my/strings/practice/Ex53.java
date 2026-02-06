package my.strings.practice;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();
		if (n <= 0) {
			System.out.println("No strings provided.");
			return;
		}

		String[] arr = new String[n];
		System.out.println("Enter strings:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}

		String prefix = arr[0];
		for (int i = 1; i < n; i++) {
			while (!arr[i].startsWith(prefix)) {
				if (prefix.length() == 0)
					break;
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}

		System.out.println("Longest common prefix: " + prefix);
	}
}

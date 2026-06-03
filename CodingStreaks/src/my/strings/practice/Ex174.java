package my.strings.practice;

import java.util.Scanner;

public class Ex174 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[n];

		System.out.println("Enter strings:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j].length() > arr[j + 1].length()
						|| (arr[j].length() == arr[j + 1].length() && arr[j].compareTo(arr[j + 1]) > 0)) {

					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Strings:");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}
}

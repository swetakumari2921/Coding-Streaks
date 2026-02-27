package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of notes:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> list = new ArrayList<>();

		System.out.println("Enter notes:");
		for (int i = 0; i < n; i++) {
			String note = sc.nextLine();
			list.add(note);
		}

		if (list.isEmpty()) {
			System.out.println("The linked list is empty.");
		} else {
			System.out.println("The linked list is not empty.");
		}
	}
}

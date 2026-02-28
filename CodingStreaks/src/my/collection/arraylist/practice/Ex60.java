package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of books:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> books = new ArrayList<>();

		System.out.println("Enter book titles:");
		for (int i = 0; i < n; i++) {
			books.add(sc.nextLine());
		}

		int middleIndex = n / 2;

		System.out.println("Middle book: " + books.get(middleIndex));
	}
}

package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> students = new ArrayList<>();
		System.out.println("Enter the names of " + n + " students:");
		for (int i = 0; i < n; i++) {
			students.add(sc.nextLine());
		}

		System.out.println("Enter the position K to swap from beginning and end:");
		int k = sc.nextInt();

		if (k >= 1 && k <= n) {
			int endIndex = n - k;
			String temp = students.get(k - 1);
			students.set(k - 1, students.get(endIndex));
			students.set(endIndex, temp);
		}

		System.out.println("Linked list after swapping:");
		for (int i = 0; i < n; i++) {
			System.out.print(students.get(i));
			if (i != n - 1)
				System.out.print(" ");
		}
		System.out.println();
	}
}

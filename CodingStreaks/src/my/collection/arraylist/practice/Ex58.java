package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of tasks:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> tasks = new ArrayList<>();

		System.out.println("Enter task names:");
		for (int i = 0; i < n; i++) {
			tasks.add(sc.nextLine());
		}

		tasks.clear();

		if (tasks.isEmpty()) {
			System.out.println("All tasks have been deleted.");
		}
	}
}

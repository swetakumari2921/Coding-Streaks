package my.collection.linkedlist.practice;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of tasks: ");
		int size = sc.nextInt();
		sc.nextLine();

		if (size <= 0) {
			System.out.println("Should be greater than 0");
			sc.close();
			return;
		}

		List<String> tasks = new LinkedList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter task " + (i + 1) + ": ");
			String task = sc.nextLine();
			tasks.add(task);
		}

		System.out.println("Number of Task: " + tasks.size());
		
		System.out.println("Tasks: ");
		for (String task : tasks) {
			System.out.println(task);
		}
		sc.close();
	}
}

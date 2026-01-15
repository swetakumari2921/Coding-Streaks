package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
	String name;
	String priority;

	Task(String name, String priority) {
		this.name = name;
		this.priority = priority;
	}
}

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Task> tasks = new ArrayList<>();

		System.out.println("===== Task Priority Manager =====");
		System.out.print("Enter number of tasks: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("\nEnter task name followed by priority (high / medium / low):");
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] parts = input.split(" ");

			String priority = parts[parts.length - 1];
			String name = "";

			for (int j = 0; j < parts.length - 1; j++) {
				name += parts[j] + " ";
			}

			tasks.add(new Task(name.trim(), priority));
		}

		System.out.println("\nTasks added successfully!");

		System.out.print("\nEnter number of priority updates: ");
		int updates = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < updates; i++) {
			System.out.println("Enter task name and new priority:");
			String update = sc.nextLine();
			String[] parts = update.split(" ");

			String newPriority = parts[parts.length - 1];
			String taskName = "";

			for (int j = 0; j < parts.length - 1; j++) {
				taskName += parts[j] + " ";
			}

			taskName = taskName.trim();

			for (Task t : tasks) {
				if (t.name.equalsIgnoreCase(taskName)) {
					t.priority = newPriority;
					break;
				}
			}
		}

		System.out.println("\n===== Final Task List (Priority Order) =====");

		System.out.println("\nHigh Priority Tasks:");
		printTasks(tasks, "high");

		System.out.println("\nMedium Priority Tasks:");
		printTasks(tasks, "medium");

		System.out.println("\nLow Priority Tasks:");
		printTasks(tasks, "low");

		System.out.println("\nThank you for using Task Priority Manager!");
		sc.close();
	}

	static void printTasks(ArrayList<Task> tasks, String priority) {
		boolean found = false;
		for (Task t : tasks) {
			if (t.priority.equalsIgnoreCase(priority)) {
				System.out.println(t.name + " (" + t.priority + ")");
				found = true;
			}
		}
		if (!found) {
			System.out.println("No tasks found.");
		}
	}
}

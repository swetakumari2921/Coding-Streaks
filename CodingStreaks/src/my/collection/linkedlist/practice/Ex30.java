package my.collection.linkedlist.practice;

import java.util.*;

public class Ex30 {

	public static void deleteLastOccurrence(LinkedList<String> list, String item) {
		int lastIndex = -1;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(item)) {
				lastIndex = i;
			}
		}

		if (lastIndex == -1) {
			System.out.println("Item \"" + item + "\" not found in the list.");
		} else {
			list.remove(lastIndex);
			System.out.println("Deleted last occurrence of \"" + item + "\".");
		}
	}

	public static void printList(LinkedList<String> list) {
		System.out.println("\nUpdated Linked List:");
		for (String task : list) {
			System.out.println(task);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> tasks = new LinkedList<>();

		System.out.print("Enter number of tasks: ");
		int n = Integer.parseInt(sc.nextLine());

		if (n <= 0) {
			System.out.println("No tasks to process.");
			return;
		}

		System.out.println("Enter tasks:");
		for (int i = 0; i < n; i++) {
			tasks.add(sc.nextLine());
		}

		System.out.print("Enter task to delete: ");
		String item = sc.nextLine();

		deleteLastOccurrence(tasks, item);
		printList(tasks);
	}
}

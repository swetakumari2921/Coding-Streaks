package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex227 {

	private LinkedList<String> history;
	private int current;

	public Ex227() {
			history = new LinkedList<>();
			current = -1;
		}

	// Perform a new action
	public void performAction(String action) {

		// Remove all redo actions
		while (history.size() > current + 1) {
			history.removeLast();
		}

		history.add(action);
		current++;

		System.out.println("Action performed: " + action);
	}

	// Undo last action
	public void undo() {

		if (current <= -1) {
			System.out.println("Nothing to undo.");
			return;
		}

		System.out.println("Undo: " + history.get(current));
		current--;
	}

	// Redo undone action
	public void redo() {

		if (current + 1 >= history.size()) {
			System.out.println("Nothing to redo.");
			return;
		}

		current++;
		System.out.println("Redo: " + history.get(current));
	}

	// Display current state
	public void display() {

		System.out.println("\nHistory:");

		for (int i = 0; i < history.size(); i++) {

			if (i == current) {
				System.out.println("-> " + history.get(i) + " [Current]");
			} else {
				System.out.println("   " + history.get(i));
			}
		}
	}

	public static void main(String[] args) {

		Ex227 system = new Ex227();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n1. Perform Action");
			System.out.println("2. Undo");
			System.out.println("3. Redo");
			System.out.println("4. Display History");
			System.out.println("5. Exit");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter action: ");
				String action = sc.nextLine();
				system.performAction(action);
				break;

			case 2:
				system.undo();
				break;

			case 3:
				system.redo();
				break;

			case 4:
				system.display();
				break;

			case 5:
				System.out.println("Program ended.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}

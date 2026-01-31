package my.collection.arraylist.practice;

import java.util.*;

public class Ex32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeMap<String, Integer> lineup = new TreeMap<>();

		System.out.print("Enter number of initial performers: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter performer name and time slot (e.g., Arijit 180):");
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			String name = parts[0];
			int timeSlot = Integer.parseInt(parts[1]);
			lineup.put(name, timeSlot);
			System.out.println("Added performer: " + name + " at " + timeSlot + " minutes");
		}

		System.out.print("\nEnter number of operations: ");
		int m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < m; i++) {
			System.out.print("Enter operation: ");
			String operationLine = sc.nextLine();
			String[] parts = operationLine.split(" ");

			String operation = parts[0].toLowerCase();

			switch (operation) {
			case "add":
				if (parts.length < 3) {
					System.out.println("Invalid add operation. Usage: add <name> <timeSlot>");
					break;
				}
				String addName = parts[1];
				int addTime = Integer.parseInt(parts[2]);
				lineup.put(addName, addTime);
				System.out.println("Performer added: " + addName + " at " + addTime + " minutes");
				break;

			case "cancel":
				if (parts.length < 2) {
					System.out.println("Invalid cancel operation. Usage: cancel <name>");
					break;
				}
				String cancelName = parts[1];
				if (lineup.remove(cancelName) != null) {
					System.out.println("Performer canceled: " + cancelName);
				} else {
					System.out.println("Performer not found: " + cancelName);
				}
				break;

			case "update":
				if (parts.length < 3) {
					System.out.println("Invalid update operation. Usage: update <name> <newTimeSlot>");
					break;
				}
				String updateName = parts[1];
				int newTime = Integer.parseInt(parts[2]);
				if (lineup.containsKey(updateName)) {
					lineup.put(updateName, newTime);
					System.out.println("Updated time slot for " + updateName + " to " + newTime + " minutes");
				} else {
					System.out.println("Performer not found: " + updateName);
				}
				break;

			default:
				System.out.println("Invalid operation. Available: add, cancel, update");
			}
		}

		System.out.println("\nFinal Festival Lineup (Sorted Alphabetically):");
		for (Map.Entry<String, Integer> entry : lineup.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		sc.close();
	}
}

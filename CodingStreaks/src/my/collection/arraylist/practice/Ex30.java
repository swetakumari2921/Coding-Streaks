package my.collection.arraylist.practice;

import java.util.*;

class Application {
	String name;
	String status;

	Application(String name, String status) {
		this.name = name;
		this.status = status;
	}
}

public class Ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of initial applications: ");
		int n = sc.nextInt();
		sc.nextLine();

		Application[] apps = new Application[n + 1000];
		int appCount = 0;

		System.out.println("Enter applicant name and status (accepted/rejected/pending):");
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			String name = parts[0];
			String status = parts[1];
			apps[appCount++] = new Application(name, status);
		}

		System.out.print("Enter number of operations: ");
		int m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < m; i++) {
			System.out.println("Enter operation (add/remove/update):");
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			String op = parts[0];

			if (op.equalsIgnoreCase("add")) {
				String name = parts[1];
				String status = parts[2];
				apps[appCount++] = new Application(name, status);
				System.out.println("Added application for " + name + " with status " + status);
			} else if (op.equalsIgnoreCase("remove")) {
				String name = parts[1];
				boolean removed = false;
				for (int j = 0; j < appCount; j++) {
					if (apps[j].name.equals(name)) {
						for (int k = j; k < appCount - 1; k++) {
							apps[k] = apps[k + 1];
						}
						apps[--appCount] = null;
						removed = true;
						System.out.println("Removed application for " + name);
						break;
					}
				}
				if (!removed) {
					System.out.println("Applicant " + name + " not found.");
				}
			} else if (op.equalsIgnoreCase("update")) {
				String name = parts[1];
				String newStatus = parts[2];
				boolean updated = false;
				for (int j = 0; j < appCount; j++) {
					if (apps[j].name.equals(name)) {
						apps[j].status = newStatus;
						updated = true;
						System.out.println("Updated status of " + name + " to " + newStatus);
						break;
					}
				}
				if (!updated) {
					System.out.println("Applicant " + name + " not found.");
				}
			} else {
				System.out.println("Invalid operation: " + op);
			}
		}

		List<String> pendingList = new ArrayList<>();
		for (int i = 0; i < appCount; i++) {
			if (apps[i].status.equalsIgnoreCase("pending")) {
				pendingList.add(apps[i].name);
			}
		}

		Collections.sort(pendingList);

		System.out.println("\nPending applications (sorted):");
		for (String name : pendingList) {
			System.out.println(name);
		}

		sc.close();
	}
}

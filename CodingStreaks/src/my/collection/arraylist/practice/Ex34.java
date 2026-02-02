package my.collection.arraylist.practice;

import java.util.*;

class Patient {
	String name;
	String vaccinationStatus;

	Patient(String name, String vaccinationStatus) {
		this.name = name;
		this.vaccinationStatus = vaccinationStatus;
	}
}

public class Ex34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> records = new ArrayList<>();

		System.out.print("Enter the number of initial patients: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter patient name and vaccination status (e.g., Alice fully_vaccinated):");
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			String name = parts[0];
			String status = parts[1];
			records.add(new Patient(name, status));
			System.out.println("Added patient: " + name + " with status " + status);
		}

		System.out.print("\nEnter the number of operations: ");
		int m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < m; i++) {
			System.out.print("Enter operation: ");
			String opLine = sc.nextLine();
			String[] parts = opLine.split(" ");
			String operation = parts[0].toLowerCase();

			switch (operation) {
			case "add":
				if (parts.length < 3) {
					System.out.println("Invalid add operation. Usage: add <patientName> <vaccinationStatus>");
					break;
				}
				String addName = parts[1];
				String addStatus = parts[2];
				records.add(new Patient(addName, addStatus));
				System.out.println("Patient added: " + addName + " with status " + addStatus);
				break;

			case "remove":
				if (parts.length < 2) {
					System.out.println("Invalid remove operation. Usage: remove <patientName>");
					break;
				}
				String removeName = parts[1];
				boolean removed = records.removeIf(p -> p.name.equalsIgnoreCase(removeName));
				if (removed) {
					System.out.println("Patient removed: " + removeName);
				} else {
					System.out.println("Patient not found: " + removeName);
				}
				break;

			case "update":
				if (parts.length < 3) {
					System.out.println("Invalid update operation. Usage: update <patientName> <newVaccinationStatus>");
					break;
				}
				String updateName = parts[1];
				String newStatus = parts[2];
				boolean updated = false;
				for (Patient p : records) {
					if (p.name.equalsIgnoreCase(updateName)) {
						p.vaccinationStatus = newStatus;
						updated = true;
						System.out.println("Updated status for " + updateName + " to " + newStatus);
						break;
					}
				}
				if (!updated) {
					System.out.println("Patient not found: " + updateName);
				}
				break;

			default:
				System.out.println("Invalid operation. Available: add, remove, update");
			}
		}

		records.sort(Comparator.comparing(p -> p.name.toLowerCase()));

		System.out.println("\nFinal Vaccination Records (Sorted Alphabetically):");
		for (Patient p : records) {
			System.out.println(p.name + " " + p.vaccinationStatus);
		}

		sc.close();
	}
}

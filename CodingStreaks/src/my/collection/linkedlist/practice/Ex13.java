package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<String> attendanceList = new LinkedList<>();

		System.out.println("===== School Class Attendance Tracker =====");

		System.out.print("Enter number of students checking in: ");
		int checkInCount = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter student names for check-in:");
		for (int i = 0; i < checkInCount; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			String studentName = sc.nextLine();
			attendanceList.add(studentName);
		}

		System.out.print("Enter number of students checking out: ");
		int checkOutCount = sc.nextInt();
		sc.nextLine();

		if (checkOutCount > 0) {
			System.out.println("Enter student names for check-out:");
		}

		for (int i = 0; i < checkOutCount; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			String studentName = sc.nextLine();

			if (attendanceList.contains(studentName)) {
				attendanceList.remove(studentName);
				System.out.println(studentName + " has checked out successfully.");
			} else {
				System.out.println(studentName + " was not found in the class list.");
			}
		}

		System.out.println("\nStudents still present in the class:");

		if (attendanceList.isEmpty()) {
			System.out.println("No students are currently present.");
		} else {
			for (int i = 0; i < attendanceList.size(); i++) {
				System.out.print(attendanceList.get(i));
				if (i < attendanceList.size() - 1) {
					System.out.print(", ");
				}
			}
		}

		System.out.println("\n===== Attendance Tracking Completed =====");

		sc.close();
	}
}

package my.collection.linkedlist.practice;

import java.util.*;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		LinkedList<String> students = new LinkedList<>();
		LinkedList<LinkedList<Integer>> scores = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of student " + (i + 1) + ": ");
			String name = sc.next();
			students.add(name);

			LinkedList<Integer> marks = new LinkedList<>();

			System.out.print("Enter Math score: ");
			sc.next();
			marks.add(sc.nextInt());

			System.out.print("Enter English score: ");
			sc.next();
			marks.add(sc.nextInt());

			System.out.print("Enter Science score: ");
			sc.next();
			marks.add(sc.nextInt());

			scores.add(marks);
		}

		System.out.print("Enter number of updates: ");
		int updates = sc.nextInt();

		for (int i = 0; i < updates; i++) {
			System.out.print("Enter student name, subject, new score: ");
			String name = sc.next();
			String subject = sc.next();
			int newScore = sc.nextInt();

			if (students.contains(name)) {
				int index = students.indexOf(name);
				LinkedList<Integer> studentMarks = scores.get(index);

				if (subject.equalsIgnoreCase("Math")) {
					studentMarks.set(0, newScore);
					System.out.println("Updated Math score for " + name);
				} else if (subject.equalsIgnoreCase("English")) {
					studentMarks.set(1, newScore);
					System.out.println("Updated English score for " + name);
				} else if (subject.equalsIgnoreCase("Science")) {
					studentMarks.set(2, newScore);
					System.out.println("Updated Science score for " + name);
				}
			} else {
				System.out.println("Student not found!");
			}
		}

		System.out.println("\nAverage scores for all students:");
		for (int i = 0; i < students.size(); i++) {
			LinkedList<Integer> m = scores.get(i);
			double avg = (m.get(0) + m.get(1) + m.get(2)) / 3.0;
			System.out.printf("%s Average: %.2f%n", students.get(i), avg);
		}
	}
}

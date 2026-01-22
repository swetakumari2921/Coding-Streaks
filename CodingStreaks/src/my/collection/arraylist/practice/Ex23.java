package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex23 {

	String name;
	String time;

	Ex23(String name, String time) {
		this.name = name;
		this.time = time;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Ex23> schedule = new ArrayList<>();

		System.out.print("Enter number of speakers to add: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String time = sc.next();
			schedule.add(new Ex23(name, time));
		}

		System.out.print("Enter number of updates/cancellations: ");
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String name = sc.next();
			String action = sc.next();
			boolean found = false;
			for (Ex23 s : schedule) {
				if (s.name.equals(name)) {
					found = true;
					if (action.equalsIgnoreCase("remove")) {
						schedule.remove(s);
					} else {
						s.time = action;
					}
					break;
				}
			}
			if (!found && !action.equalsIgnoreCase("remove")) {
				schedule.add(new Ex23(name, action));
			}
		}

		Collections.sort(schedule, new Comparator<Ex23>() {
			public int compare(Ex23 s1, Ex23 s2) {
				return s1.time.compareTo(s2.time);
			}
		});

		System.out.print("Final speaker schedule: ");
		for (int i = 0; i < schedule.size(); i++) {
			System.out.print(schedule.get(i).name + " " + schedule.get(i).time);
			if (i != schedule.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		sc.close();
	}
}

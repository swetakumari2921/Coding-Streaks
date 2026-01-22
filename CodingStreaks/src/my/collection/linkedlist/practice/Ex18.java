package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Ex18 {

	String name;
	String time;

	Ex18(String name, String time) {
		this.name = name;
		this.time = time;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Ex18> schedule = new LinkedList<>();

		System.out.print("Enter number of speakers to add: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String time = sc.next();
			schedule.add(new Ex18(name, time));
		}

		System.out.print("Enter number of updates/cancellations: ");
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String name = sc.next();
			String action = sc.next();
			boolean found = false;
			Iterator<Ex18> it = schedule.iterator();
			while (it.hasNext()) {
				Ex18 s = it.next();
				if (s.name.equals(name)) {
					found = true;
					if (action.equalsIgnoreCase("remove")) {
						it.remove();
					} else {
						s.time = action;
					}
					break;
				}
			}
			if (!found && !action.equalsIgnoreCase("remove")) {
				schedule.add(new Ex18(name, action));
			}
		}

		Collections.sort(schedule, new Comparator<Ex18>() {
			public int compare(Ex18 s1, Ex18 s2) {
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

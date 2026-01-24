package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex20 {

	String name;
	int cars;

	public Ex20(String name, int cars) {
		this.name = name;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return name + " (" + cars + " cars)";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Ex20> intersections = new LinkedList<>();

		System.out.println("=== City Traffic Management System ===");

		System.out.print("Enter number of intersections to add: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of intersection " + (i + 1) + ": ");
			String name = sc.nextLine();

			System.out.print("Enter number of cars at " + name + ": ");
			int cars = sc.nextInt();
			sc.nextLine();

			intersections.add(new Ex20(name, cars));
		}

		System.out.print("Enter the intersection name to update traffic: ");
		String updateName = sc.nextLine();

		System.out.print("Enter number of cars to add/remove (use negative number to remove): ");
		int carsChange = sc.nextInt();
		sc.nextLine();

		boolean found = false;
		for (Ex20 inter : intersections) {
			if (inter.name.equalsIgnoreCase(updateName)) {
				inter.cars += carsChange;
				if (inter.cars < 0)
					inter.cars = 0;
				found = true;
				System.out.println("Updated traffic at " + inter.name + ": " + inter.cars + " cars.");
				break;
			}
		}

		if (!found) {
			System.out.println("Intersection not found! Adding it as a new intersection.");
			intersections.add(new Ex20(updateName, Math.max(carsChange, 0)));
		}

		Collections.sort(intersections, new Comparator<Ex20>() {
			public int compare(Ex20 i1, Ex20 i2) {
				return i2.cars - i1.cars;
			}
		});

		System.out.println("\n=== Intersections sorted by traffic flow ===");
		for (Ex20 inter : intersections) {
			System.out.println(inter);
		}

		sc.close();
	}
}

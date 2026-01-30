package my.collection.linkedlist.practice;

import java.util.*;

class Road {
	String name;
	int vehicles;

	Road(String name, int vehicles) {
		this.name = name;
		this.vehicles = vehicles;
	}
}

public class Ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Road> roads = new LinkedList<>();

		System.out.println("Enter number of roads:");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter road name:");
			String roadName = sc.nextLine();

			System.out.println("Enter vehicle count:");
			int count = sc.nextInt();
			sc.nextLine();

			roads.add(new Road(roadName, count));
		}

		System.out.println("Enter number of operations:");
		int m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < m; i++) {
			System.out.println("Enter operation (add/remove/update):");
			String[] input = sc.nextLine().split(" ");

			String operation = input[0];
			String roadName = input[1];
			int value = Integer.parseInt(input[2]);

			boolean found = false;

			for (Road road : roads) {
				if (road.name.equalsIgnoreCase(roadName)) {
					found = true;

					switch (operation.toLowerCase()) {
					case "add":
						road.vehicles += value;
						System.out.println(value + " vehicles added to " + roadName);
						break;
					case "remove":
						road.vehicles = Math.max(0, road.vehicles - value);
						System.out.println(value + " vehicles removed from " + roadName);
						break;
					case "update":
						road.vehicles = value;
						System.out.println("Traffic updated on " + roadName);
						break;
					}
					break;
				}
			}

			if (!found && operation.equalsIgnoreCase("add")) {
				roads.add(new Road(roadName, value));
				System.out.println(value + " vehicles added to new road " + roadName);
			}
		}

		roads.sort(Comparator.comparing(r -> r.name.toLowerCase()));

		System.out.println("\nFinal Traffic Status (Sorted by Road Name):");
		for (Road road : roads) {
			System.out.println(road.name + " " + road.vehicles);
		}

		sc.close();
	}
}

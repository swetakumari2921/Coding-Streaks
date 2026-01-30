package my.collection.arraylist.practice;

import java.util.*;

public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> trafficMap = new HashMap<>();

		System.out.println("Enter number of roads:");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter road name:");
			String road = sc.nextLine();

			System.out.println("Enter vehicle count:");
			int count = sc.nextInt();
			sc.nextLine();

			trafficMap.put(road, count);
		}

		System.out.println("Enter number of operations:");
		int m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < m; i++) {
			System.out.println("Enter operation (add/remove/update):");
			String[] input = sc.nextLine().split(" ");

			String operation = input[0];
			String road = input[1];
			int value = Integer.parseInt(input[2]);

			if (operation.equalsIgnoreCase("add")) {
				trafficMap.put(road, trafficMap.getOrDefault(road, 0) + value);
				System.out.println(value + " vehicles added to " + road);

			} else if (operation.equalsIgnoreCase("remove")) {
				int current = trafficMap.getOrDefault(road, 0);
				int updated = Math.max(0, current - value);
				trafficMap.put(road, updated);
				System.out.println(value + " vehicles removed from " + road);

			} else if (operation.equalsIgnoreCase("update")) {
				trafficMap.put(road, value);
				System.out.println("Traffic updated on " + road);
			}
		}

		TreeMap<String, Integer> sortedMap = new TreeMap<>(trafficMap);

		System.out.println("\nFinal Traffic Status (Sorted by Road Name):");
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		sc.close();
	}
}

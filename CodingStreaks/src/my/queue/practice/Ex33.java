package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex33 {

	public static int findStartingStation(int[] gas, int[] cost) {
		Queue<Integer> queue = new LinkedList<>();

		int n = gas.length;

		for (int i = 0; i < n; i++) {
			queue.add(i);
		}

		int start = -1;
		int fuel = 0;

		while (!queue.isEmpty()) {
			int station = queue.poll();

			fuel += gas[station] - cost[station];

			if (fuel >= 0) {
				if (start == -1) {
					start = station;
				}
			} else {
				start = -1;
				fuel = 0;
			}
		}

		return start;
	}

	public static void main(String[] args) {

		int[] gas = { 4, 6, 7, 4 };
		int[] cost = { 6, 5, 3, 5 };

		int result = findStartingStation(gas, cost);

		System.out.println("Starting Station: " + result);
	}
}

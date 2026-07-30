package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

class PetrolPump {
	int petrol;
	int distance;

	PetrolPump(int petrol, int distance) {
		this.petrol = petrol;
		this.distance = distance;
	}
}

public class Ex32 {

	public static int findStartingPoint(Queue<PetrolPump> queue) {

		int start = 0;
		int petrol = 0;
		int count = 0;

		Queue<PetrolPump> temp = new LinkedList<>(queue);

		while (!temp.isEmpty()) {
			PetrolPump pump = temp.poll();

			petrol += pump.petrol - pump.distance;
			count++;

			if (petrol < 0) {
				start = count;
				petrol = 0;
			}
		}

		return start < queue.size() ? start : -1;
	}

	public static void main(String[] args) {

		Queue<PetrolPump> queue = new LinkedList<>();

		queue.add(new PetrolPump(4, 6));
		queue.add(new PetrolPump(6, 5));
		queue.add(new PetrolPump(7, 3));
		queue.add(new PetrolPump(4, 5));

		int result = findStartingPoint(queue);

		if (result == -1) {
			System.out.println("No possible starting point");
		} else {
			System.out.println("Starting point: " + result);
		}
	}
}

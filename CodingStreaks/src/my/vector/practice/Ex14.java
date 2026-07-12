package my.vector.practice;

import java.util.Vector;

public class Ex14 {

	static int countFrequency(Vector<Integer> vector, int element) {
		int count = 0;

		for (int value : vector) {
			if (value == element) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(10);
		vector.add(30);
		vector.add(10);
		vector.add(40);
		vector.add(20);

		int element = 10;

		int frequency = countFrequency(vector, element);

		System.out.println("Vector: " + vector);
		System.out.println("Element: " + element);
		System.out.println("Frequency: " + frequency);
	}
}

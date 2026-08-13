package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex228 {

	private LinkedList<Integer> stream;
	private int windowSize;
	private int threshold;

	public Ex228(int windowSize, int threshold) {
		stream = new LinkedList<>();
		this.windowSize = windowSize;
		this.threshold = threshold;
	}

	// Process one value from the stream
	public void addValue(int value) {

		// If enough previous values exist, check for anomaly
		if (stream.size() >= windowSize) {

			int sum = 0;

			// Calculate average of recent values
			for (int i = stream.size() - windowSize; i < stream.size(); i++) {
				sum += stream.get(i);
			}

			double average = (double) sum / windowSize;

			// Check difference from average
			if (Math.abs(value - average) > threshold) {
				System.out.println("Anomaly detected: " + value + " | Previous average: " + average);
			} else {
				System.out.println("Normal value: " + value);
			}

		} else {
			System.out.println("Not enough data: " + value);
		}

		// Add new value to LinkedList
		stream.add(value);
	}

	// Display complete stream
	public void display() {
		System.out.println("Stream: " + stream);
	}

	public static void main(String[] args) {

		Ex228 detector = new Ex228(3, 20);

		detector.addValue(10);
		detector.addValue(12);
		detector.addValue(11);
		detector.addValue(13);
		detector.addValue(50);
		detector.addValue(14);

		detector.display();
	}
}

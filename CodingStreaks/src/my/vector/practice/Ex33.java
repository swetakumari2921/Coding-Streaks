package my.vector.practice;

import java.util.Vector;

public class Ex33 {

	public static void splitVector(Vector<Integer> vector) {
		int mid = vector.size() / 2;

		Vector<Integer> firstPart = new Vector<>();
		Vector<Integer> secondPart = new Vector<>();

		for (int i = 0; i < mid; i++) {
			firstPart.add(vector.get(i));
		}

		for (int i = mid; i < vector.size(); i++) {
			secondPart.add(vector.get(i));
		}

		System.out.println("Original Vector : " + vector);
		System.out.println("First Part      : " + firstPart);
		System.out.println("Second Part     : " + secondPart);
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		vector.add(60);

		splitVector(vector);
	}
}

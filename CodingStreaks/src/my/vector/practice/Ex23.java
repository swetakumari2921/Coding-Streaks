package my.vector.practice;

import java.util.Collections;
import java.util.Vector;

public class Ex23 {

	public static void sortVector(Vector<Integer> vector) {
		Collections.sort(vector);
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(50);
		vector.add(20);
		vector.add(40);
		vector.add(10);
		vector.add(30);

		System.out.println("Before Sorting: " + vector);

		sortVector(vector);

		System.out.println("After Sorting: " + vector);
	}
}

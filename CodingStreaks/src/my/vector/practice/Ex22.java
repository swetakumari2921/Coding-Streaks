package my.vector.practice;

import java.util.Vector;

public class Ex22 {

	public static Vector<Integer> mergeVectors(Vector<Integer> v1, Vector<Integer> v2) {

		Vector<Integer> merged = new Vector<>();

		merged.addAll(v1);
		merged.addAll(v2);

		return merged;
	}

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);

		Vector<Integer> v2 = new Vector<>();
		v2.add(40);
		v2.add(50);
		v2.add(60);

		Vector<Integer> result = mergeVectors(v1, v2);

		System.out.println("Merged Vector: " + result);
	}
}

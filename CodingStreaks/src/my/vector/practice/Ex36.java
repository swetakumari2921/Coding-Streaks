package my.vector.practice;

import java.util.HashSet;
import java.util.Vector;

public class Ex36 {

	public static Vector<Integer> findUnion(Vector<Integer> v1, Vector<Integer> v2) {

		HashSet<Integer> set = new HashSet<>();

		// Add elements from first vector
		for (int num : v1) {
			set.add(num);
		}

		// Add elements from second vector
		for (int num : v2) {
			set.add(num);
		}

		// Convert HashSet to Vector
		Vector<Integer> union = new Vector<>();
		union.addAll(set);

		return union;
	}

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);

		Vector<Integer> v2 = new Vector<>();
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);

		System.out.println("Vector 1: " + v1);
		System.out.println("Vector 2: " + v2);

		Vector<Integer> union = findUnion(v1, v2);

		System.out.println("Union: " + union);
	}
}

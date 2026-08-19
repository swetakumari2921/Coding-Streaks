package my.vector.practice;

import java.util.Vector;

public class Ex50 {

	public static Vector<Integer> findDuplicates(Vector<Integer> v) {

		Vector<Integer> duplicates = new Vector<>();

		for (int i = 0; i < v.size(); i++) {

			for (int j = i + 1; j < v.size(); j++) {

				if (v.get(i).equals(v.get(j))) {

					// Avoid adding the same duplicate again
					if (!duplicates.contains(v.get(i))) {
						duplicates.add(v.get(i));
					}

					break;
				}
			}
		}

		return duplicates;
	}

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(20);
		v.add(40);
		v.add(10);
		v.add(50);
		v.add(30);

		Vector<Integer> result = findDuplicates(v);

		System.out.println("Vector = " + v);
		System.out.println("Duplicate Elements = " + result);
	}
}

package my.vector.practice;

import java.util.Collections;
import java.util.Vector;

public class Ex28 {

	// Function to find a triplet with the given sum
	public static boolean findTriplet(Vector<Integer> vec, int target) {
		Collections.sort(vec);

		int n = vec.size();

		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int sum = vec.get(i) + vec.get(left) + vec.get(right);

				if (sum == target) {
					System.out.println("Triplet: " + vec.get(i) + " " + vec.get(left) + " " + vec.get(right));
					return true;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();

		vec.add(1);
		vec.add(4);
		vec.add(45);
		vec.add(6);
		vec.add(10);
		vec.add(8);

		int target = 22;

		if (!findTriplet(vec, target)) {
			System.out.println("No triplet found.");
		}
	}
}

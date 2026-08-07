package my.vector.practice;

import java.util.Vector;

public class Ex40 {

	// Find equilibrium index
	public static int findEquilibriumIndex(Vector<Integer> vector) {

		int totalSum = 0;

		// Calculate total sum
		for (int num : vector) {
			totalSum += num;
		}

		int leftSum = 0;

		// Check each index
		for (int i = 0; i < vector.size(); i++) {

			// Right sum = total sum - left sum - current element
			int rightSum = totalSum - leftSum - vector.get(i);

			if (leftSum == rightSum) {
				return i;
			}

			leftSum += vector.get(i);
		}

		return -1;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(1);
		vector.add(3);
		vector.add(5);
		vector.add(2);
		vector.add(2);

		System.out.println("Vector: " + vector);

		int index = findEquilibriumIndex(vector);

		if (index != -1) {
			System.out.println("Equilibrium Index: " + index);
		} else {
			System.out.println("No Equilibrium Index Found");
		}
	}
}

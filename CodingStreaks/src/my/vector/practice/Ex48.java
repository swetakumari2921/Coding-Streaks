package my.vector.practice;

import java.util.Vector;

public class Ex48 {

	public static void findMaxSubarray(Vector<Integer> v) {

		if (v == null || v.isEmpty()) {
			System.out.println("Vector is empty");
			return;
		}

		int currentSum = v.get(0);
		int maxSum = v.get(0);

		int start = 0;
		int end = 0;
		int tempStart = 0;

		for (int i = 1; i < v.size(); i++) {

			// Start a new subarray if current element is better
			if (v.get(i) > currentSum + v.get(i)) {
				currentSum = v.get(i);
				tempStart = i;
			} else {
				currentSum = currentSum + v.get(i);
			}

			// Update maximum sum
			if (currentSum > maxSum) {
				maxSum = currentSum;
				start = tempStart;
				end = i;
			}
		}

		System.out.println("Maximum Sum = " + maxSum);

		System.out.print("Maximum Sum Subarray = [");

		for (int i = start; i <= end; i++) {
			System.out.print(v.get(i));

			if (i < end) {
				System.out.print(", ");
			}
		}

		System.out.println("]");
	}

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(-2);
		v.add(1);
		v.add(-3);
		v.add(4);
		v.add(-1);
		v.add(2);
		v.add(1);
		v.add(-5);
		v.add(4);

		findMaxSubarray(v);
	}
}

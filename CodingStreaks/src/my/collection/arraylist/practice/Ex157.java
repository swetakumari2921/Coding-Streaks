package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex157 {

	public static int maxSumTwoSubarrays(ArrayList<Integer> list, int k1, int k2) {

		int n = list.size();
		int maxSum = 0;

		for (int i = 0; i <= n - k1; i++) {

			int sum1 = 0;

			for (int j = i; j < i + k1; j++) {
				sum1 += list.get(j);
			}

			for (int p = 0; p <= n - k2; p++) {

				if (p + k2 - 1 < i || p > i + k1 - 1) {

					int sum2 = 0;

					for (int q = p; q < p + k2; q++) {
						sum2 += list.get(q);
					}

					int total = sum1 + sum2;

					if (total > maxSum) {
						maxSum = total;
					}
				}
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(0);
		list.add(9);
		list.add(5);

		int k1 = 2;
		int k2 = 2;

		int result = maxSumTwoSubarrays(list, k1, k2);

		System.out.println("Maximum Sum = " + result);
	}
}

package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			int sum1 = 0;

			for (int j = i; j < n; j++) {

				sum1 += arr.get(j);

				for (int k = j + 1; k < n; k++) {

					int sum2 = 0;

					for (int l = k; l < n; l++) {

						sum2 += arr.get(l);

						for (int m = l + 1; m < n; m++) {

							int sum3 = 0;

							for (int p = m; p < n; p++) {

								sum3 += arr.get(p);

								int total = sum1 + sum2 + sum3;

								if (total > maxSum) {
									maxSum = total;
								}
							}
						}
					}
				}
			}
		}

		System.out.println("Maximum Sum = " + maxSum);
	}
}

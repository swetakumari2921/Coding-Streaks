package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				int sum = 0;
				int sign = 1;

				for (int k = i; k <= j; k++) {
					sum += sign * arr.get(k);
					sign = -sign;
				}

				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}

		System.out.println(maxSum);

		sc.close();
	}
}

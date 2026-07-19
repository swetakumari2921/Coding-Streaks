package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex211 {

	public static int longestSubarray(ArrayList<Integer> arr) {
		int n = arr.size();
		int maxLength = 0;

		for (int i = 0; i < n; i++) {
			int evenSum = 0;
			int oddSum = 0;

			for (int j = i; j < n; j++) {

				if (j % 2 == 0)
					evenSum += arr.get(j);
				else
					oddSum += arr.get(j);

				if (evenSum == oddSum) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.println(longestSubarray(arr));

		sc.close();
	}
}

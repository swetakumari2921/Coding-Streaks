package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex210 {

	public static int longestSubarray(ArrayList<Integer> arr, int L, int R) {
		int n = arr.size();
		int maxLength = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {
				sum += arr.get(j);

				if (sum >= L && sum <= R) {
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

		int L = sc.nextInt();
		int R = sc.nextInt();

		System.out.println(longestSubarray(arr, L, R));

		sc.close();
	}
}

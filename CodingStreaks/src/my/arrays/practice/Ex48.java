package my.arrays.practice;

import java.util.*;

public class Ex48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements (0s and 1s):");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxLength = findMaxLength(arr);
		System.out.println("Maximum length subarray with equal 0s and 1s: " + maxLength);
		sc.close();
	}

	private static int findMaxLength(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0, maxLen = 0;
		map.put(0, -1);

		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] == 0) ? -1 : 1;

			if (map.containsKey(sum)) {
				maxLen = Math.max(maxLen, i - map.get(sum));
			} else {
				map.put(sum, i);
			}
		}

		return maxLen;
	}
}

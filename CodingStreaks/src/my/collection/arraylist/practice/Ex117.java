package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex117 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		for (int i = 0; i < arr.length - 3; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			for (int j = i + 1; j < arr.length - 2; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}

				int left = j + 1;
				int right = arr.length - 1;

				while (left < right) {
					int sum = arr[i] + arr[j] + arr[left] + arr[right];

					if (sum == target) {
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[left]);
						temp.add(arr[right]);
						result.add(temp);

						left++;
						right--;

						while (left < right && arr[left] == arr[left - 1]) {
							left++;
						}
						while (left < right && arr[right] == arr[right + 1]) {
							right--;
						}
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}

		System.out.println(result);
	}
}

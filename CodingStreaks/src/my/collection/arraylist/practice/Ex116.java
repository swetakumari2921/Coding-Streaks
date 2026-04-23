package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex116 {

	static ArrayList<ArrayList<Integer>> threeSum(int[] arr) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = arr.length - 1;

			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];

				if (sum == 0) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
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
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		ArrayList<ArrayList<Integer>> ans = threeSum(arr);

		for (ArrayList<Integer> list : ans) {
			System.out.println(list);
		}
	}
}

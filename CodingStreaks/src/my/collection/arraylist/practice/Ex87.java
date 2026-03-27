package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex87 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 1, 4 };
		int n = arr.length;

		ArrayList<Integer> visited = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (visited.contains(arr[i])) {
				continue;
			}

			int count = 0;

			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			System.out.println(arr[i] + " -> " + count);
			visited.add(arr[i]);
		}
	}
}

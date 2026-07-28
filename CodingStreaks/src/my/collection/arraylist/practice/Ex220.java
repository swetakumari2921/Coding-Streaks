package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex220 {

	public static int countSubsets(ArrayList<Integer> arr, int D) {
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		if (sum < D || (sum + D) % 2 != 0) {
			return 0;
		}

		int target = (sum + D) / 2;

		int[] dp = new int[target + 1];
		dp[0] = 1;

		for (int num : arr) {
			for (int j = target; j >= num; j--) {
				dp[j] += dp[j - num];
			}
		}

		return dp[target];
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(3);

		int D = 1;

		System.out.println("Count of subsets: " + countSubsets(arr, D));
	}
}

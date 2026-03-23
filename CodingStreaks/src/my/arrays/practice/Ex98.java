package my.arrays.practice;

public class Ex98 {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 1 };

		int n = arr.length;
		int totalOnes = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1)
				totalOnes++;
		}

		if (totalOnes == 0) {
			System.out.println(0);
			return;
		}

		
		int currOnes = 0;

		for (int i = 0; i < totalOnes; i++) {
			if (arr[i] == 1)
				currOnes++;
		}

		int maxOnes = currOnes;

		for (int i = totalOnes; i < n; i++) {
			if (arr[i] == 1)
				currOnes++;
			if (arr[i - totalOnes] == 1)
				currOnes--;

			if (currOnes > maxOnes)
				maxOnes = currOnes;
		}

		int minSwaps = totalOnes - maxOnes;
		System.out.println("Minimum swaps: " + minSwaps);
	}
}

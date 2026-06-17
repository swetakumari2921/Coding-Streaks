package my.arrays.practice;

public class Ex194 {

	public static void findEquilibriumElement(int[] arr) {
		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}

		int leftSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum -= arr[i]; // right sum

			if (leftSum == totalSum) {
				System.out.println("Equilibrium Element: " + arr[i]);
				return;
			}

			leftSum += arr[i];
		}

		System.out.println("No Equilibrium Element Found");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 2 };

		findEquilibriumElement(arr);
	}
}

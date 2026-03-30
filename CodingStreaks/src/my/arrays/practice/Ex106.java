package my.arrays.practice;

public class Ex106 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; // change values to test

		boolean isUnique = true;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (!isUnique)
				break;
		}

		if (isUnique)
			System.out.println("All elements are unique");
		else
			System.out.println("Array contains duplicates");
	}
}

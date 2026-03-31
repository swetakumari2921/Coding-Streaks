package my.arrays.practice;

public class Ex108 {
	public static void main(String[] args) {
		int arr[] = { 7, 3, 10, 5, 2, 9 };

		int minEven = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] < minEven)
				minEven = arr[i];
		}

		if (minEven == Integer.MAX_VALUE)
			System.out.println("No even number");
		else
			System.out.println(minEven);
	}
}

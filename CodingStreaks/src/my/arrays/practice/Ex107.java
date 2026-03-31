package my.arrays.practice;

public class Ex107 {
	public static void main(String[] args) {
		int arr[] = { 2, -3, 5, -1, -7, 4 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				count++;
		}

		System.out.println(count);
	}
}

package my.strings.practice;

public class Ex159 {

	// Function to reverse a part of character array
	public static void reverse(char[] arr, int start, int end) {
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		String str = "Java is easy";

		// Convert string to char array
		char[] arr = str.toCharArray();

		int n = arr.length;

		// Step 1: Reverse complete string
		reverse(arr, 0, n - 1);

		// Step 2: Reverse each word
		int start = 0;

		for (int i = 0; i <= n; i++) {

			if (i == n || arr[i] == ' ') {
				reverse(arr, start, i - 1);
				start = i + 1;
			}
		}

		System.out.println(new String(arr));
	}
}

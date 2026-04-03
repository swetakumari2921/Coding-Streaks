package my.strings.practice;

public class Ex110 {
	public static void main(String[] args) {
		String str = "mamad";
		char[] arr = str.toCharArray();
		int n = arr.length;
		int swaps = 0;

		if (!canFormPalindrome(arr)) {
			System.out.println(-1);
			return;
		}

		int i = 0, j = n - 1;

		while (i < j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else {
				int k = j;
				while (k > i && arr[k] != arr[i]) {
					k--;
				}

				if (k == i) {
					char temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swaps++;
				} else {
					while (k < j) {
						char temp = arr[k];
						arr[k] = arr[k + 1];
						arr[k + 1] = temp;
						swaps++;
						k++;
					}
					i++;
					j--;
				}
			}
		}

		System.out.println(swaps);
	}

	static boolean canFormPalindrome(char[] arr) {
		int[] freq = new int[256];

		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}

		int odd = 0;
		for (int i = 0; i < 256; i++) {
			if (freq[i] % 2 != 0) {
				odd++;
			}
		}

		return odd <= 1;
	}
}

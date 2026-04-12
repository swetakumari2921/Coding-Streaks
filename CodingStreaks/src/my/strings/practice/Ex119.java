package my.strings.practice;

public class Ex119 {
	public static void main(String[] args) {
		String str = "aabbbc";

		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		int max = 0;

		for (int i = 0; i < 256; i++) {
			if (freq[i] > max) {
				max = freq[i];
			}
		}

		int operations = str.length() - max;
		System.out.println(operations);
	}
}

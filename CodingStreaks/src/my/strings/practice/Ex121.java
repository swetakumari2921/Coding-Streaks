package my.strings.practice;

public class Ex121 {
	public static void main(String[] args) {
		String str = "abcabc";
		int k = 3;

		for (int i = 0; i <= str.length() - k; i++) {
			boolean isDistinct = true;

			for (int j = i; j < i + k; j++) {
				for (int l = j + 1; l < i + k; l++) {
					if (str.charAt(j) == str.charAt(l)) {
						isDistinct = false;
						break;
					}
				}
				if (!isDistinct)
					break;
			}

			if (isDistinct) {
				for (int j = i; j < i + k; j++) {
					System.out.print(str.charAt(j));
				}
				System.out.println();
			}
		}
	}
}

package my.strings.practice;

public class Ex102 {
	static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void main(String[] args) {
		String str = "abcdeiouxyz";
		int n = str.length();

		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			int vowel = 0, consonant = 0;

			for (int j = i; j < n; j++) {
				char ch = str.charAt(j);

				if (isVowel(ch))
					vowel++;
				else
					consonant++;

				if (vowel == consonant) {
					int len = j - i + 1;
					if (len > maxLen) {
						maxLen = len;
					}
				}
			}
		}

		System.out.println(maxLen);
	}
}

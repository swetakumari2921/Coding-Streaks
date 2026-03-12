package my.strings.practice;

public class Ex87 {

	public static int minimalRotation(String s) {
		String str = s + s;
		int n = str.length();
		int[] f = new int[n];
		for (int i = 0; i < n; i++)
			f[i] = -1;

		int k = 0;

		for (int j = 1; j < n; j++) {
			int i = f[j - k - 1];
			while (i != -1 && str.charAt(j) != str.charAt(k + i + 1)) {
				if (str.charAt(j) < str.charAt(k + i + 1))
					k = j - i - 1;
				i = f[i];
			}
			if (i == -1 && str.charAt(j) != str.charAt(k)) {
				if (str.charAt(j) < str.charAt(k))
					k = j;
				f[j - k] = -1;
			} else {
				f[j - k] = i + 1;
			}
		}

		return k;
	}

	public static void main(String[] args) {
		String s = "baca";
		int idx = minimalRotation(s);
		String minimalRotation = s.substring(idx) + s.substring(0, idx);

		System.out.println("Lexicographically minimal rotation: " + minimalRotation);
	}
}
